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


public class Main extends ASTRAClass {
	public Main() {
		setParents(new Class[] {astra.lang.Agent.class});
		addRule(new Rule(
			"Main", new int[] {15,9,15,74},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					new Variable(Type.STRING, "sname",false),
					new Variable(Type.STRING, "X",false)
				})
			),
			new Predicate("light", new Term[] {
				new Variable(Type.STRING, "lname",false),
				new Variable(Type.STRING, "Y",false)
			}),
			new Block(
				"Main", new int[] {15,73,17,5},
				new Statement[] {
					new Subgoal(
						"Main", new int[] {16,8,17,5},
						new Goal(
							new Predicate("light", new Term[] {
								new Variable(Type.STRING, "lname"),
								new Variable(Type.STRING, "X")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {19,9,19,68},
			new GoalEvent('+',
				new Goal(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "lname",false),
						new Variable(Type.STRING, "state",false)
					})
				)
			),
			new Predicate("light", new Term[] {
				new Variable(Type.STRING, "lname"),
				new Variable(Type.STRING, "state")
			}),
			new Block(
				"Main", new int[] {19,67,19,69},
				new Statement[] {
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {21,9,21,76},
			new GoalEvent('+',
				new Goal(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "lname",false),
						new Variable(Type.STRING, "state",false)
					})
				)
			),
			new Predicate("light", new Term[] {
				new Variable(Type.STRING, "lname"),
				new Variable(Type.STRING, "state2",false)
			}),
			new Block(
				"Main", new int[] {21,75,24,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Main", new int[] {22,8,24,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "lname"),
							new Variable(Type.STRING, "state2")
						})
					),
					new BeliefUpdate('+',
						"Main", new int[] {23,8,24,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "lname"),
							new Variable(Type.STRING, "state")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {26,9,26,44},
			new BeliefEvent('+',
				new Predicate("light", new Term[] {
					new Variable(Type.STRING, "lname",false),
					new Variable(Type.STRING, "state",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {26,43,28,5},
				new Statement[] {
					new ModuleCall("c",
						"Main", new int[] {27,8,27,63},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Light: "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "lname"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" is in state: "),
										new Variable(Type.STRING, "state")
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","c")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {30,9,30,20},
			new GoalEvent('+',
				new Goal(
					new Predicate("flash", new Term[] {
						Primitive.newPrimitive(0)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {30,19,32,5},
				new Statement[] {
					new ModuleCall("s",
						"Main", new int[] {31,8,31,16},
						new Predicate("exit", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","s")).exit(
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {34,9,34,114},
			new GoalEvent('+',
				new Goal(
					new Predicate("flash", new Term[] {
						new Variable(Type.INTEGER, "N",false)
					})
				)
			),
			new AND(
				new Comparison(">",
					new Variable(Type.INTEGER, "N"),
					Primitive.newPrimitive(0)
				),
				new AND(
					new Comparison("<=",
						new Variable(Type.INTEGER, "N"),
						Primitive.newPrimitive(10)
					),
					new AND(
						new Predicate("switch", new Term[] {
							new Variable(Type.STRING, "sname",false),
							new Variable(Type.STRING, "stateX",false)
						}),
						new Predicate("transition", new Term[] {
							new Variable(Type.STRING, "stateX"),
							new Variable(Type.STRING, "stateY",false)
						})
					)
				)
			),
			new Block(
				"Main", new int[] {34,113,40,5},
				new Statement[] {
					new SpecialBeliefUpdate(
						"Main", new int[] {36,8,40,5},
						new Predicate("switch", new Term[] {
							Primitive.newPrimitive("s1"),
							new Variable(Type.STRING, "stateY")
						})
					),
					new ModuleCall("s",
						"Main", new int[] {37,8,37,20},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","s")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"Main", new int[] {39,8,40,5},
						new Goal(
							new Predicate("flash", new Term[] {
								Operator.newOperator('-',
									new Variable(Type.INTEGER, "N"),
									Primitive.newPrimitive(1)
								)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {42,9,42,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {42,27,44,5},
				new Statement[] {
					new Subgoal(
						"Main", new int[] {43,8,44,5},
						new Goal(
							new Predicate("flash", new Term[] {
								Primitive.newPrimitive(10)
							})
						)
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.initialize(
			new Predicate("light", new Term[] {
				Primitive.newPrimitive("l1"),
				Primitive.newPrimitive("off")
			})
		);
		agent.initialize(
			new Predicate("switch", new Term[] {
				Primitive.newPrimitive("s1"),
				Primitive.newPrimitive("off")
			})
		);
		agent.initialize(
			new Predicate("transition", new Term[] {
				Primitive.newPrimitive("on"),
				Primitive.newPrimitive("off")
			})
		);
		agent.initialize(
			new Predicate("transition", new Term[] {
				Primitive.newPrimitive("off"),
				Primitive.newPrimitive("on")
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("c",astra.lang.Console.class,agent);
		fragment.addModule("s",astra.lang.System.class,agent);
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
			astra.core.Agent agent = new Main().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
