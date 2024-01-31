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
			"Player", new int[] {33,9,33,61},
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
				"Player", new int[] {33,60,37,5},
				new Statement[] {
					new Subgoal(
						"Player", new int[] {34,8,37,5},
						new Goal(
							new Predicate("move", new Term[] {
								new Variable(Type.INTEGER, "L",false)
							})
						)
					),
					new Subgoal(
						"Player", new int[] {35,8,37,5},
						new Goal(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "P"),
								new Variable(Type.INTEGER, "L")
							})
						)
					),
					new Subgoal(
						"Player", new int[] {36,8,37,5},
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
			"Player", new int[] {39,9,39,62},
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
				"Player", new int[] {39,61,42,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Player", new int[] {40,8,42,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "P")
						})
					),
					new ModuleCall("console",
						"Player", new int[] {41,8,41,39},
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
			"Player", new int[] {44,9,44,53},
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
				"Player", new int[] {44,52,47,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Player", new int[] {45,8,47,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "P")
						})
					),
					new ModuleCall("console",
						"Player", new int[] {46,8,46,33},
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
			"Player", new int[] {49,9,49,43},
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
				"Player", new int[] {49,42,51,5},
				new Statement[] {
					new SpecialBeliefUpdate(
						"Player", new int[] {50,8,51,5},
						new Predicate("turn", new Term[] {
							new Variable(Type.STRING, "O")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {53,9,53,45},
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
				"Player", new int[] {53,44,55,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {54,8,55,5},
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "P"),
							new Variable(Type.INTEGER, "L")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {57,8,57,34},
			new BeliefEvent('+',
				new Predicate("played", new Term[] {
					new Variable(Type.STRING, "P",false),
					new Variable(Type.INTEGER, "L",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {57,33,59,5},
				new Statement[] {
					new ModuleCall("console",
						"Player", new int[] {58,8,58,68},
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
			"Player", new int[] {61,9,61,32},
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
				"Player", new int[] {61,31,63,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {62,8,63,5},
						Primitive.newPrimitive(1)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {65,9,65,32},
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
				"Player", new int[] {65,31,67,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {66,8,67,5},
						Primitive.newPrimitive(2)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {69,9,69,32},
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
				"Player", new int[] {69,31,71,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {70,8,71,5},
						Primitive.newPrimitive(3)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {73,9,73,32},
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
				"Player", new int[] {73,31,75,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {74,8,75,5},
						Primitive.newPrimitive(4)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {77,9,77,32},
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
				"Player", new int[] {77,31,79,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {78,8,79,5},
						Primitive.newPrimitive(5)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {81,9,81,32},
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
				"Player", new int[] {81,31,83,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {82,8,83,5},
						Primitive.newPrimitive(6)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {85,9,85,32},
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
				"Player", new int[] {85,31,87,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {86,8,87,5},
						Primitive.newPrimitive(7)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {89,9,89,32},
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
				"Player", new int[] {89,31,91,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {90,8,91,5},
						Primitive.newPrimitive(8)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {93,9,93,32},
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
				"Player", new int[] {93,31,95,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Player", new int[] {94,8,95,5},
						Primitive.newPrimitive(9)
					)
				}
			)
		));
		addRule(new Rule(
			"Player", new int[] {97,9,97,47},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new ListTerm(new Term[] {
							new Variable(Type.STRING, "token",false),
							new Variable(Type.BOOLEAN, "turn",false)
						})
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Player", new int[] {97,46,103,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Player", new int[] {98,8,103,5},
						new Predicate("player", new Term[] {
							new Variable(Type.STRING, "token")
						})
					),
					new If(
						"Player", new int[] {99,8,103,5},
						new Comparison("==",
							new Variable(Type.BOOLEAN, "turn"),
							Primitive.newPrimitive(true)
						),
						new Block(
							"Player", new int[] {99,24,101,9},
							new Statement[] {
								new BeliefUpdate('+',
									"Player", new int[] {100,12,101,9},
									new Predicate("turn", new Term[] {
										new Variable(Type.STRING, "token")
									})
								)
							}
						)
					),
					new ModuleCall("console",
						"Player", new int[] {102,8,102,70},
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
