/*
 * USE - UML based specification environment
 * Copyright (C) 1999-2010 Mark Richters, University of Bremen
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 */

// $Id$

package org.tzi.use.kodkod.assl.dynamics;

import org.tzi.use.gen.assl.dynamics.GConfiguration;
import org.tzi.use.gen.assl.dynamics.GEvalInstruction;
import org.tzi.use.gen.assl.dynamics.GEvaluationException;
import org.tzi.use.gen.assl.dynamics.IGCaller;
import org.tzi.use.gen.assl.dynamics.IGCollector;
import org.tzi.use.gen.assl.statics.GInstrTry_Seq;
import org.tzi.use.kodkod.assl.AsslTranslation;
import org.tzi.use.uml.ocl.value.CollectionValue;
import org.tzi.use.uml.ocl.value.Value;

/**
 * eval try sequence
 * 
 * based on {@link GEvalInstrTry_Seq}
 * 
 * @author Juergen Widdermann
 */
public class GEvalInstrTry_SeqKodKod extends GEvalInstruction implements IGCaller {
    private GInstrTry_Seq fInstr;
    private IGCaller fCaller;
	private boolean backtrackingNecessary;
	private AsslTranslation asslTranslation;

    public GEvalInstrTry_SeqKodKod(GInstrTry_Seq instr, boolean backtrackingNecessary, AsslTranslation asslTranslation ) {
        fInstr = instr;
		this.backtrackingNecessary = backtrackingNecessary;
		this.asslTranslation = asslTranslation;
    }

    public void eval(GConfiguration conf,
                     IGCaller caller,
                     IGCollector collector) throws GEvaluationException {
        collector.detailPrintWriter().println(new StringBuilder("evaluating `").append(fInstr).append("'").toString());
        fCaller = caller;
//		if(backtrackingNecessary) {
//			System.out.println("Backtracking f?r: " + fInstr + " ist an.");
//		} else {
//			System.out.println("Backtracking f?r: " + fInstr + " ist aus.");
//		}
        GCreatorKodKod.createFor(fInstr.sequenceInstr()).eval( conf, this, collector );
    }

    public void feedback( GConfiguration conf,
                          Value value,
                          IGCollector collector ) throws GEvaluationException {
        if (value.isUndefined())
            collector.invalid( buildCantExecuteMessage(fInstr,fInstr.sequenceInstr()) );
        else {
        	if(backtrackingNecessary) {
        		// Save Upper-Bound before Try-Instruction
    			asslTranslation.saveUpperBounds(fInstr);
	            for (Value elem : (CollectionValue)value) {
	            	if (collector.canStop()) {
	                	break;
	                }
	                collector.detailPrintWriter().println("`"+ fInstr + "' == "+elem);
	                fCaller.feedback( conf, elem, collector );
	                //Load Savebounds
	                asslTranslation.loadSavedBounds(fInstr);
	            }
        	} else {
        		fCaller.feedback(conf, value, collector);
        	}
        }
    }

    public String toString() {
        return "GEvalInstrTry_Seq";
    }

}