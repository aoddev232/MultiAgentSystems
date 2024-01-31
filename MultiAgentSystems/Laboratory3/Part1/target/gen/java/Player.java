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


public class Player extends ASTRAClass {
	public Player() {
		setParents(new Class[] {astra.lang.Agent.class});
		addInference(new Inference(
			new Predicate("free", new Term[] {
				new Variable(Type.INTEGER, "L",false)
			}),
			new AND(
				new Predicate("location", new Term[] {
					new Variable(Type.INTEGER, "L")
				}),
				new NOT(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "P",false),
						new Variable(Type.INTEGER, "L")
					})
				)
			)
		));
		addInference(new Inference(
			new Predicate("winner", new Term[] {
				new Variable(Type.STRING, "P",false)
			}),
			new AND(
				new Predicate("line", new Term[] {
					new Variable(Type.INTEGER, "L1",false),
					new Variable(Type.INTEGER, "L2",false),
					new Variable(Type.INTEGER, "L3",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "P"),
						new Variable(Type.INTEGER, "L1")
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "P"),
							new Variable(Type.INTEGER, "L2")
						}),
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "P"),
							new Variable(Type.INTEGER, "L3")
						})
					)
				)
			)
		));
		addInference(new Inference(
			new Predicate("loser", new Term[] {
				new Variable(Type.STRING, "P",false)
			}),
			new AND(
				new Predicate("player", new Term[] {
					new Variable(Type.STRING, "P")
				}),
				new AND(
					new Predicate("winner", new Term[] {
						new Variable(Type.STRING, "O",false)
					}),
					new Comparison("~=",
						new Variable(Type.STRING, "P"),
						new Variable(Type.STRING, "O")
					)
				)
			)
		));
		addInference(new Inference(
			new Predicate("drawn", new Term[] {}),
			new AND(
				new NOT(
					new Predicate("free", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				),
				new NOT(
					new Predicate("winner", new Term[] {
						new Variable(Type.STRING, "O",false)
					})
				)
			)
		));
		addInference(new Inference(
			new Predicate("opponent", new Term[] {
				new Variable(Type.STRING, "P",false),
				new Variable(Type.STRING, "O",false)
			}),
			new AND(
				new Predicate("player", new Term[] {
					new Variable(Type.STRING, "O")
				}),
				new Comparison("~=",
					new Variable(Type.STRING, "O"),
					new Variable(Type.STRING, "P")
				)
			)
		));
		addRule(new Rule(
			"Player", new int[] {44,9,44,61},
			new BeliefEvent('+',
				new Predicate("turn", new Term[] {
					new Variable(Type.STRING, "P",false)
				})
			),
			new AND(
				new Predicate("player", new Term[] {
					new Variable(Type.STRING, "P")
				}),
				new Predicate("opponent", new Term[] {
					new Variable(Type.STRING, "P"),
					new Variable(Type.STRING, "O",false)
				})
			),
			new Block(
				"Player", new int[] {44,60,48,5},
				new Statement[] {
					new Subgoal(
						"Player", new int[] {45,8,48,5},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.INTEGER, "L",false)
							})
						)
					),
					new Subgoal(
						"Player", new int[] {46,8,48,5},
						new Goal(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "P"),
								new Variable(Type.INTEGER, "L")
							})
						)
					),
					new Subgoal(
						"Player", new int[] {47,8,48,5},
						new Goal(
							new Predicate("turn", new Term[] {
								new Variable(Type.STRING, "O")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {50,9,50,62},
			new GoalEvent('+',
				new Goal(
					new Predicate("turn", new Term[] {
						new Variable(Type.STRING, "O",false)
					})
				)
			),
			new AND(
				new Predicate("turn", new Term[] {
					new Variable(Type.STRING, "P",false)
				}),
				new Predicate("winner", new Term[] {
					new Variable(Type.STRING, "W",false)
				})
			),
			new Block(
				"Player", new int[] {50,61,53,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Player", new int[] {51,8,53,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "P")
						})
					),
					new ModuleCall("console",
						"Player", new int[] {52,8,52,39},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Winner: "),
								new Variable(Type.STRING, "W")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {55,9,55,53},
			new GoalEvent('+',
				new Goal(
					new Predicate("turn", new Term[] {
						new Variable(Type.STRING, "O",false)
					})
				)
			),
			new AND(
				new Predicate("turn", new Term[] {
					new Variable(Type.STRING, "P",false)
				}),
				new Predicate("drawn", new Term[] {})
			),
			new Block(
				"Player", new int[] {55,52,58,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Player", new int[] {56,8,58,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "P")
						})
					),
					new ModuleCall("console",
						"Player", new int[] {57,8,57,33},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Drawn!")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {60,9,60,43},
			new GoalEvent('+',
				new Goal(
					new Predicate("turn", new Term[] {
						new Variable(Type.STRING, "O",false)
					})
				)
			),
			new Predicate("turn", new Term[] {
				new Variable(Type.STRING, "P",false)
			}),
			new Block(
				"Player", new int[] {60,42,62,5},
				new Statement[] {
					new SpecialBeliefUpdate(
						"Player", new int[] {61,8,62,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "O")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {64,9,64,45},
			new GoalEvent('+',
				new Goal(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "P",false),
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				new Variable(Type.INTEGER, "L")
			}),
			new Block(
				"Player", new int[] {64,44,66,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {65,8,66,5},
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "P"),
							new Variable(Type.INTEGER, "L")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {68,8,68,34},
			new BeliefEvent('+',
				new Predicate("played", new Term[] {
					new Variable(Type.STRING, "P",false),
					new Variable(Type.INTEGER, "L",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {68,33,70,5},
				new Statement[] {
					new ModuleCall("console",
						"Player", new int[] {69,8,69,68},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Player "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "P"),
									Operator.newOperator('+',
										Primitive.newPrimitive(" played at location: "),
										new Variable(Type.INTEGER, "L")
									)
								)
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("Player","console")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {72,9,72,32},
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
				"Player", new int[] {72,31,74,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {73,8,74,5},
						Primitive.newPrimitive(1)
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.initialize(
			new Predicate("location", new Term[] {
				Primitive.newPrimitive(1)
			})
		);
		agent.initialize(
			new Predicate("location", new Term[] {
				Primitive.newPrimitive(2)
			})
		);
		agent.initialize(
			new Predicate("location", new Term[] {
				Primitive.newPrimitive(3)
			})
		);
		agent.initialize(
			new Predicate("location", new Term[] {
				Primitive.newPrimitive(4)
			})
		);
		agent.initialize(
			new Predicate("location", new Term[] {
				Primitive.newPrimitive(5)
			})
		);
		agent.initialize(
			new Predicate("location", new Term[] {
				Primitive.newPrimitive(6)
			})
		);
		agent.initialize(
			new Predicate("location", new Term[] {
				Primitive.newPrimitive(7)
			})
		);
		agent.initialize(
			new Predicate("location", new Term[] {
				Primitive.newPrimitive(8)
			})
		);
		agent.initialize(
			new Predicate("location", new Term[] {
				Primitive.newPrimitive(9)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(2),
				Primitive.newPrimitive(3)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(9)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(1),
				Primitive.newPrimitive(4),
				Primitive.newPrimitive(7)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(2),
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(8)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(3),
				Primitive.newPrimitive(6),
				Primitive.newPrimitive(9)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(3),
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(7)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(4),
				Primitive.newPrimitive(5),
				Primitive.newPrimitive(6)
			})
		);
		agent.initialize(
			new Predicate("line", new Term[] {
				Primitive.newPrimitive(7),
				Primitive.newPrimitive(8),
				Primitive.newPrimitive(9)
			})
		);
		agent.initialize(
			new Predicate("player", new Term[] {
				Primitive.newPrimitive("X")
			})
		);
		agent.initialize(
			new Predicate("player", new Term[] {
				Primitive.newPrimitive("O")
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("console",astra.lang.Console.class,agent);
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
			astra.core.Agent agent = new Player().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
