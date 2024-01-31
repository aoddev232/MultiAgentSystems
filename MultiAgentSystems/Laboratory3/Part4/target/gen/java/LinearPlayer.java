/**
 * GENERATED CODE - DO NOT CHANGE
 */

import astra.core.*;
import astra.execution.*;
import astra.event.*;
import astra.messaging.*;
import astra.formula.*;
import astra.lang.*;
import astra.statement.*;
import astra.term.*;
import astra.type.*;
import astra.tr.*;
import astra.reasoner.util.*;


public class LinearPlayer extends ASTRAClass {
	public LinearPlayer() {
		setParents(new Class[] {Player.class});
		addRule(new Rule(
			"LinearPlayer", new int[] {2,9,2,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(1)
			}),
			new Block(
				"LinearPlayer", new int[] {2,31,4,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"LinearPlayer", new int[] {3,8,4,5},
						Primitive.newPrimitive(1)
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {6,9,6,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(2)
			}),
			new Block(
				"LinearPlayer", new int[] {6,31,8,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"LinearPlayer", new int[] {7,8,8,5},
						Primitive.newPrimitive(2)
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {10,9,10,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(3)
			}),
			new Block(
				"LinearPlayer", new int[] {10,31,12,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"LinearPlayer", new int[] {11,8,12,5},
						Primitive.newPrimitive(3)
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {14,9,14,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(4)
			}),
			new Block(
				"LinearPlayer", new int[] {14,31,16,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"LinearPlayer", new int[] {15,8,16,5},
						Primitive.newPrimitive(4)
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {18,9,18,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(5)
			}),
			new Block(
				"LinearPlayer", new int[] {18,31,20,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"LinearPlayer", new int[] {19,8,20,5},
						Primitive.newPrimitive(5)
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {22,9,22,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(6)
			}),
			new Block(
				"LinearPlayer", new int[] {22,31,24,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"LinearPlayer", new int[] {23,8,24,5},
						Primitive.newPrimitive(6)
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {26,9,26,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(7)
			}),
			new Block(
				"LinearPlayer", new int[] {26,31,28,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"LinearPlayer", new int[] {27,8,28,5},
						Primitive.newPrimitive(7)
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {30,9,30,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(8)
			}),
			new Block(
				"LinearPlayer", new int[] {30,31,32,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"LinearPlayer", new int[] {31,8,32,5},
						Primitive.newPrimitive(8)
					)
				}
			)
		));
		addRule(new Rule(
			"LinearPlayer", new int[] {34,9,34,32},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive(9)
			}),
			new Block(
				"LinearPlayer", new int[] {34,31,36,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"LinearPlayer", new int[] {35,8,36,5},
						Primitive.newPrimitive(9)
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		return fragment;
	}

	public static void main(String[] args) {
		Scheduler.setStrategy(new TestSchedulerStrategy());
		ListTerm argList = new ListTerm();
		for (String arg: args) {
			argList.add(Primitive.newPrimitive(arg));
		}

		String name = java.lang.System.getProperty("astra.name", "main");
		try {
			astra.core.Agent agent = new LinearPlayer().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
