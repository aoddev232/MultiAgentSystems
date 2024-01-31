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
		addRule(new Rule(
			"Player", new int[] {31,9,31,44},
			new BeliefEvent('+',
				new Predicate("turn", new Term[] {
					new Variable(Type.STRING, "P",false)
				})
			),
			new Predicate("winner", new Term[] {
				new Variable(Type.STRING, "W",false)
			}),
			new Block(
				"Player", new int[] {31,43,34,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Player", new int[] {32,8,34,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "P")
						})
					),
					new ModuleCall("console",
						"Player", new int[] {33,8,33,39},
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
			"Player", new int[] {36,9,36,35},
			new BeliefEvent('+',
				new Predicate("turn", new Term[] {
					new Variable(Type.STRING, "P",false)
				})
			),
			new Predicate("drawn", new Term[] {}),
			new Block(
				"Player", new int[] {36,34,39,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Player", new int[] {37,8,39,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "P")
						})
					),
					new ModuleCall("console",
						"Player", new int[] {38,8,38,33},
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
			"Player", new int[] {41,9,41,60},
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
					new Variable(Type.STRING, "opp",false)
				})
			),
			new Block(
				"Player", new int[] {41,59,46,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Player", new int[] {42,8,46,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "P")
						})
					),
					new Subgoal(
						"Player", new int[] {43,8,46,5},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.INTEGER, "L",false)
							})
						)
					),
					new Subgoal(
						"Player", new int[] {44,8,46,5},
						new Goal(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "P"),
								new Variable(Type.INTEGER, "L")
							})
						)
					),
					new Send("Player", new int[] {45,8,45,39},
						new Performative("inform"),
						new Variable(Type.STRING, "opp"),
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "P"),
							new Variable(Type.INTEGER, "L")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {48,9,48,68},
			new GoalEvent('+',
				new Goal(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "P",false),
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("free", new Term[] {
					new Variable(Type.INTEGER, "L")
				}),
				new Predicate("opponent", new Term[] {
					new Variable(Type.STRING, "opp",false)
				})
			),
			new Block(
				"Player", new int[] {48,67,50,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {49,8,50,5},
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "P"),
							new Variable(Type.INTEGER, "L")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {52,8,52,34},
			new BeliefEvent('+',
				new Predicate("played", new Term[] {
					new Variable(Type.STRING, "P",false),
					new Variable(Type.INTEGER, "L",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {52,33,54,5},
				new Statement[] {
					new ModuleCall("console",
						"Player", new int[] {53,8,53,68},
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
			"Player", new int[] {56,9,56,32},
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
				"Player", new int[] {56,31,58,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {57,8,58,5},
						Primitive.newPrimitive(1)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {60,9,60,32},
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
				"Player", new int[] {60,31,62,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {61,8,62,5},
						Primitive.newPrimitive(2)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {64,9,64,32},
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
				"Player", new int[] {64,31,66,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {65,8,66,5},
						Primitive.newPrimitive(3)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {68,9,68,32},
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
				"Player", new int[] {68,31,70,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {69,8,70,5},
						Primitive.newPrimitive(4)
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
				Primitive.newPrimitive(5)
			}),
			new Block(
				"Player", new int[] {72,31,74,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {73,8,74,5},
						Primitive.newPrimitive(5)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {76,9,76,32},
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
				"Player", new int[] {76,31,78,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {77,8,78,5},
						Primitive.newPrimitive(6)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {80,9,80,32},
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
				"Player", new int[] {80,31,82,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {81,8,82,5},
						Primitive.newPrimitive(7)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {84,9,84,32},
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
				"Player", new int[] {84,31,86,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {85,8,86,5},
						Primitive.newPrimitive(8)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {88,9,88,32},
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
				"Player", new int[] {88,31,90,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {89,8,90,5},
						Primitive.newPrimitive(9)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {93,9,93,94},
			new MessageEvent(
				new Performative("inform"),
				new Variable(Type.STRING, "sender",false),
				new Predicate("played", new Term[] {
					new Variable(Type.STRING, "P",false),
					new Variable(Type.INTEGER, "L",false)
				})
			),
			new AND(
				new Predicate("player", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new Comparison("~=",
					new Variable(Type.STRING, "O"),
					new Variable(Type.STRING, "P")
				)
			),
			new Block(
				"Player", new int[] {93,93,97,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Player", new int[] {94,8,97,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "P")
						})
					),
					new BeliefUpdate('+',
						"Player", new int[] {95,8,97,5},
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "P"),
							new Variable(Type.INTEGER, "L")
						})
					),
					new BeliefUpdate('+',
						"Player", new int[] {96,8,97,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "O")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {99,9,99,64},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new ListTerm(new Term[] {
							new Variable(Type.STRING, "token",false),
							new Variable(Type.STRING, "opponent",false),
							new Variable(Type.BOOLEAN, "turn",false)
						})
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {99,63,106,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {100,8,106,5},
						new Predicate("player", new Term[] {
							new Variable(Type.STRING, "token")
						})
					),
					new BeliefUpdate('+',
						"Player", new int[] {101,8,106,5},
						new Predicate("opponent", new Term[] {
							new Variable(Type.STRING, "opponent")
						})
					),
					new If(
						"Player", new int[] {102,8,106,5},
						new Comparison("==",
							new Variable(Type.BOOLEAN, "turn"),
							Primitive.newPrimitive(true)
						),
						new Block(
							"Player", new int[] {102,24,104,9},
							new Statement[] {
								new BeliefUpdate('+',
									"Player", new int[] {103,12,104,9},
									new Predicate("turn", new Term[] {
										new Variable(Type.STRING, "token")
									})
								)
							}
						)
					),
					new ModuleCall("console",
						"Player", new int[] {105,8,105,70},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("Created Player "),
								Operator.newOperator('+',
									new Variable(Type.STRING, "token"),
									Operator.newOperator('+',
										Primitive.newPrimitive(", Turn: "),
										new Variable(Type.BOOLEAN, "turn")
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
