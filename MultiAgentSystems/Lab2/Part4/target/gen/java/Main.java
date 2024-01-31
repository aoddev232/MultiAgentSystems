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
			"Main", new int[] {21,9,21,98},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					Primitive.newPrimitive("on")
				})
			),
			new AND(
				new Predicate("light_level", new Term[] {
					new Variable(Type.INTEGER, "lux",false)
				}),
				new AND(
					new Predicate("light_threshold", new Term[] {
						new Variable(Type.INTEGER, "threshold",false)
					}),
					new Comparison(">",
						new Variable(Type.INTEGER, "lux"),
						new Variable(Type.INTEGER, "threshold")
					)
				)
			),
			new Block(
				"Main", new int[] {21,97,21,99},
				new Statement[] {
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {23,9,23,32},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					new Variable(Type.STRING, "state",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {23,31,25,5},
				new Statement[] {
					new Subgoal(
						"Main", new int[] {24,8,25,5},
						new Goal(
							new Predicate("light", new Term[] {
								Primitive.newPrimitive("l1"),
								new Variable(Type.STRING, "state")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {27,9,27,62},
			new GoalEvent('+',
				new Goal(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "lt",false),
						new Variable(Type.STRING, "state",false)
					})
				)
			),
			new Predicate("light", new Term[] {
				new Variable(Type.STRING, "lt"),
				new Variable(Type.STRING, "state")
			}),
			new Block(
				"Main", new int[] {27,61,27,63},
				new Statement[] {
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {29,9,29,71},
			new GoalEvent('+',
				new Goal(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "lt",false),
						new Variable(Type.STRING, "stateX",false)
					})
				)
			),
			new Predicate("light", new Term[] {
				new Variable(Type.STRING, "lt"),
				new Variable(Type.STRING, "stateY",false)
			}),
			new Block(
				"Main", new int[] {29,70,32,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Main", new int[] {30,8,32,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "lt"),
							new Variable(Type.STRING, "stateY")
						})
					),
					new BeliefUpdate('+',
						"Main", new int[] {31,8,32,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "lt"),
							new Variable(Type.STRING, "stateX")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {34,9,34,42},
			new BeliefEvent('+',
				new Predicate("light", new Term[] {
					new Variable(Type.STRING, "lt",false),
					new Variable(Type.STRING, "state",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {34,41,36,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {35,8,35,66},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Light: "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "lt"),
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
								return ((astra.lang.Console) intention.getModule("Main","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {38,9,38,125},
			new BeliefEvent('+',
				new Predicate("light_level", new Term[] {
					new Variable(Type.INTEGER, "lux",false)
				})
			),
			new AND(
				new Predicate("switch", new Term[] {
					Primitive.newPrimitive("on")
				}),
				new AND(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "lt",false),
						Primitive.newPrimitive("off")
					}),
					new AND(
						new Predicate("light_threshold", new Term[] {
							new Variable(Type.INTEGER, "threshold",false)
						}),
						new Comparison("<",
							new Variable(Type.INTEGER, "lux"),
							new Variable(Type.INTEGER, "threshold")
						)
					)
				)
			),
			new Block(
				"Main", new int[] {38,124,40,5},
				new Statement[] {
					new Subgoal(
						"Main", new int[] {39,8,40,5},
						new Goal(
							new Predicate("light", new Term[] {
								new Variable(Type.STRING, "lt"),
								Primitive.newPrimitive("on")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {42,9,42,123},
			new BeliefEvent('+',
				new Predicate("light_level", new Term[] {
					new Variable(Type.INTEGER, "lux",false)
				})
			),
			new AND(
				new Predicate("switch", new Term[] {
					Primitive.newPrimitive("on")
				}),
				new AND(
					new Predicate("light", new Term[] {
						new Variable(Type.STRING, "lt",false),
						Primitive.newPrimitive("on")
					}),
					new AND(
						new Predicate("light_threshold", new Term[] {
							new Variable(Type.INTEGER, "threshold",false)
						}),
						new Comparison(">",
							new Variable(Type.INTEGER, "lux"),
							new Variable(Type.INTEGER, "threshold")
						)
					)
				)
			),
			new Block(
				"Main", new int[] {42,122,44,5},
				new Statement[] {
					new Subgoal(
						"Main", new int[] {43,8,44,5},
						new Goal(
							new Predicate("light", new Term[] {
								new Variable(Type.STRING, "lt"),
								Primitive.newPrimitive("off")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {46,9,46,30},
			new GoalEvent('+',
				new Goal(
					new Predicate("day_simulation", new Term[] {
						Primitive.newPrimitive(24)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {46,29,46,31},
				new Statement[] {
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {48,9,48,65},
			new GoalEvent('+',
				new Goal(
					new Predicate("day_simulation", new Term[] {
						new Variable(Type.INTEGER, "hour",false)
					})
				)
			),
			new Predicate("hour_light", new Term[] {
				new Variable(Type.INTEGER, "hour"),
				new Variable(Type.INTEGER, "lux",false)
			}),
			new Block(
				"Main", new int[] {48,64,54,5},
				new Statement[] {
					new ModuleCall("console",
						"Main", new int[] {49,8,49,66},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Hour:"),
								Operator.newOperator('+',
									new Variable(Type.INTEGER, "hour"),
									Operator.newOperator('+',
										Primitive.newPrimitive("    Light Level:"),
										new Variable(Type.INTEGER, "lux")
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Main","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new SpecialBeliefUpdate(
						"Main", new int[] {50,8,54,5},
						new Predicate("light_level", new Term[] {
							new Variable(Type.INTEGER, "lux")
						})
					),
					new ModuleCall("system",
						"Main", new int[] {51,8,51,25},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","system")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new Subgoal(
						"Main", new int[] {52,8,54,5},
						new Goal(
							new Predicate("switch_simulation", new Term[] {
								new Variable(Type.INTEGER, "hour")
							})
						)
					),
					new Subgoal(
						"Main", new int[] {53,8,54,5},
						new Goal(
							new Predicate("day_simulation", new Term[] {
								Operator.newOperator('+',
									new Variable(Type.INTEGER, "hour"),
									Primitive.newPrimitive(1)
								)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {56,9,56,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("switch_simulation", new Term[] {
						Primitive.newPrimitive(10)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {56,32,58,5},
				new Statement[] {
					new SpecialBeliefUpdate(
						"Main", new int[] {57,8,58,5},
						new Predicate("switch", new Term[] {
							Primitive.newPrimitive("on")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {60,9,60,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("switch_simulation", new Term[] {
						Primitive.newPrimitive(18)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {60,32,62,5},
				new Statement[] {
					new SpecialBeliefUpdate(
						"Main", new int[] {61,8,62,5},
						new Predicate("switch", new Term[] {
							Primitive.newPrimitive("off")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {64,9,64,40},
			new GoalEvent('+',
				new Goal(
					new Predicate("switch_simulation", new Term[] {
						new Variable(Type.INTEGER, "hour",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {64,39,64,41},
				new Statement[] {
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {66,9,66,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {66,27,68,5},
				new Statement[] {
					new SpawnGoal(
						"Main", new int[] {67,8,68,5},
						new Goal(
							new Predicate("day_simulation", new Term[] {
								Primitive.newPrimitive(0)
							})
						)
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.initialize(
			new Predicate("switch", new Term[] {
				Primitive.newPrimitive("on")
			})
		);
		agent.initialize(
			new Predicate("light", new Term[] {
				Primitive.newPrimitive("l1"),
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
		agent.initialize(
			new Predicate("light_threshold", new Term[] {
				Primitive.newPrimitive(750)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(0),
				Primitive.newPrimitive(1)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(1)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(2),
				Primitive.newPrimitive(1)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(3),
				Primitive.newPrimitive(1)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(4),
				Primitive.newPrimitive(1)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(1)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(6),
				Primitive.newPrimitive(100)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(7),
				Primitive.newPrimitive(250)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(8),
				Primitive.newPrimitive(400)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(9),
				Primitive.newPrimitive(900)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(10),
				Primitive.newPrimitive(1000)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(11),
				Primitive.newPrimitive(1000)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(12),
				Primitive.newPrimitive(1000)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(13),
				Primitive.newPrimitive(1000)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(14),
				Primitive.newPrimitive(1000)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(15),
				Primitive.newPrimitive(800)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(16),
				Primitive.newPrimitive(700)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(17),
				Primitive.newPrimitive(600)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(18),
				Primitive.newPrimitive(600)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(19),
				Primitive.newPrimitive(400)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(20),
				Primitive.newPrimitive(100)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(21),
				Primitive.newPrimitive(100)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(22),
				Primitive.newPrimitive(1)
			})
		);
		agent.initialize(
			new Predicate("hour_light", new Term[] {
				Primitive.newPrimitive(23),
				Primitive.newPrimitive(1)
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("console",astra.lang.Console.class,agent);
		fragment.addModule("system",astra.lang.System.class,agent);
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
