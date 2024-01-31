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


public class VacBot extends ASTRAClass {
	public VacBot() {
		setParents(new Class[] {astra.lang.Agent.class});
		addInference(new Inference(
			new Predicate("free", new Term[] {
				new Variable(Type.STRING, "position",false)
			}),
			new OR(
				new ModuleFormula("ei",
					new Predicate("square", new Term[] {
						new Variable(Type.STRING, "position"),
						Primitive.newPrimitive("empty")
					}),
					new ModuleFormulaAdaptor() {
						public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
							return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				),
				new ModuleFormula("ei",
					new Predicate("square", new Term[] {
						new Variable(Type.STRING, "position"),
						Primitive.newPrimitive("dust")
					}),
					new ModuleFormulaAdaptor() {
						public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
							return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
						}
					}
				)
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {23,9,23,33},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new ListTerm(new Term[] {
							new Variable(Type.STRING, "vacbot",false)
						})
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"VacBot", new int[] {23,32,27,5},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {24,8,24,21},
						new Predicate("join", new Term[] {
							Primitive.newPrimitive("hw")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).join(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("ei",
						"VacBot", new int[] {25,8,25,23},
						new Predicate("link", new Term[] {
							new Variable(Type.STRING, "vacbot")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).link(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("C",
						"VacBot", new int[] {26,8,26,37},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("VacBot activated")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("VacBot","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {29,9,29,45},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("location", new Term[] {
						new Variable(Type.LONG, "X",false),
						new Variable(Type.LONG, "Y",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("VacBot","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"VacBot", new int[] {29,44,32,5},
				new Statement[] {
					new BeliefUpdate('+',
						"VacBot", new int[] {30,8,32,5},
						new Predicate("location", new Term[] {
							new Variable(Type.LONG, "X"),
							new Variable(Type.LONG, "Y")
						})
					),
					new Subgoal(
						"VacBot", new int[] {31,8,32,5},
						new Goal(
							new Predicate("task", new Term[] {
								new Variable(Type.STRING, "action",false)
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {34,9,34,41},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("direction", new Term[] {
						new Variable(Type.STRING, "D",false)
					})
				}),
				new ModuleEventAdaptor() {
					public Event generate(astra.core.Agent agent, Predicate predicate) {
						return ((astra.lang.EIS) agent.getModule("VacBot","ei")).event(
							"+",
							predicate.getTerm(0)
						);
					}
				}
			),
			Predicate.TRUE,
			new Block(
				"VacBot", new int[] {34,40,36,5},
				new Statement[] {
					new BeliefUpdate('+',
						"VacBot", new int[] {35,8,36,5},
						new Predicate("direction", new Term[] {
							new Variable(Type.STRING, "D")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {38,9,38,57},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new ModuleFormula("ei",
				new Predicate("square", new Term[] {
					Primitive.newPrimitive("here"),
					Primitive.newPrimitive("dust")
				}),
				new ModuleFormulaAdaptor() {
					public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
						return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
					}
				}
			),
			new Block(
				"VacBot", new int[] {38,56,42,5},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {39,8,39,18},
						new Predicate("clean", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Subgoal(
						"VacBot", new int[] {41,8,42,5},
						new Goal(
							new Predicate("task", new Term[] {
								new Variable(Type.STRING, "action")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {44,9,44,60},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new ModuleFormula("ei",
				new Predicate("square", new Term[] {
					Primitive.newPrimitive("forward"),
					Primitive.newPrimitive("dust")
				}),
				new ModuleFormulaAdaptor() {
					public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
						return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
					}
				}
			),
			new Block(
				"VacBot", new int[] {44,59,47,5},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {45,8,45,26},
						new Predicate("move", new Term[] {
							Primitive.newPrimitive("forward")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {46,8,47,5},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {49,9,49,57},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new ModuleFormula("ei",
				new Predicate("square", new Term[] {
					Primitive.newPrimitive("left"),
					Primitive.newPrimitive("dust")
				}),
				new ModuleFormulaAdaptor() {
					public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
						return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
					}
				}
			),
			new Block(
				"VacBot", new int[] {49,56,52,5},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {50,8,50,23},
						new Predicate("move", new Term[] {
							Primitive.newPrimitive("left")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {51,8,52,5},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {54,9,54,58},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new ModuleFormula("ei",
				new Predicate("square", new Term[] {
					Primitive.newPrimitive("right"),
					Primitive.newPrimitive("dust")
				}),
				new ModuleFormulaAdaptor() {
					public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
						return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
					}
				}
			),
			new Block(
				"VacBot", new int[] {54,57,57,5},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {55,8,55,24},
						new Predicate("move", new Term[] {
							Primitive.newPrimitive("right")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {56,8,57,5},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {59,9,59,48},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive("forward")
			}),
			new Block(
				"VacBot", new int[] {59,47,62,5},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {60,8,60,26},
						new Predicate("move", new Term[] {
							Primitive.newPrimitive("forward")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {61,8,62,5},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {64,9,64,45},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive("left")
			}),
			new Block(
				"VacBot", new int[] {64,44,67,5},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {65,8,65,23},
						new Predicate("move", new Term[] {
							Primitive.newPrimitive("left")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {66,8,67,5},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {69,9,69,46},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new Predicate("free", new Term[] {
				Primitive.newPrimitive("right")
			}),
			new Block(
				"VacBot", new int[] {69,45,72,5},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {70,8,70,24},
						new Predicate("move", new Term[] {
							Primitive.newPrimitive("right")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {71,8,72,5},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {74,9,74,31},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"VacBot", new int[] {74,30,79,5},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {75,8,75,24},
						new Predicate("move", new Term[] {
							Primitive.newPrimitive("right")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {76,8,79,5},
						Primitive.newPrimitive("move")
					),
					new ModuleCall("ei",
						"VacBot", new int[] {77,8,77,24},
						new Predicate("move", new Term[] {
							Primitive.newPrimitive("right")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {78,8,79,5},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {81,9,81,20},
			new GoalEvent('+',
				new Goal(
					new Predicate("update", new Term[] {})
				)
			),
			Predicate.TRUE,
			new Block(
				"VacBot", new int[] {81,19,93,5},
				new Statement[] {
					new Query(
						"VacBot", new int[] {82,8,82,38},
						new Predicate("location", new Term[] {
							new Variable(Type.LONG, "X",false),
							new Variable(Type.LONG, "Y",false)
						})
					),
					new Query(
						"VacBot", new int[] {83,8,83,34},
						new Predicate("direction", new Term[] {
							new Variable(Type.STRING, "D",false)
						})
					),
					new ForEach(
						"VacBot", new int[] {85,8,93,5},
						new AND(
							new ModuleFormula("ei",
								new Predicate("square", new Term[] {
									new Variable(Type.STRING, "location",false),
									Primitive.newPrimitive("obstacle")
								}),
								new ModuleFormulaAdaptor() {
									public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
										return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
									}
								}
							),
							new NOT(
								new ModuleFormula("r",
									new Predicate("obstacle", new Term[] {
										new Variable(Type.LONG, "X"),
										new Variable(Type.LONG, "Y"),
										new Variable(Type.STRING, "D"),
										new Variable(Type.STRING, "location")
									}),
								new ModuleFormulaAdaptor() {
										public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
											return ((Routing) visitor.agent().getModule("VacBot","r")).obstacle(
												(long) visitor.evaluate(predicate.getTerm(0)),
												(long) visitor.evaluate(predicate.getTerm(1)),
												(java.lang.String) visitor.evaluate(predicate.getTerm(2)),
												(java.lang.String) visitor.evaluate(predicate.getTerm(3))
											);
									}
								}
									)
							)
						),
						new Block(
							"VacBot", new int[] {85,84,87,5},
							new Statement[] {
								new ModuleCall("r",
									"VacBot", new int[] {86,12,86,44},
									new Predicate("recordObstacle", new Term[] {
										new Variable(Type.LONG, "X"),
										new Variable(Type.LONG, "Y"),
										new Variable(Type.STRING, "D"),
										new Variable(Type.STRING, "location")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((Routing) intention.getModule("VacBot","r")).recordObstacle(
												(java.lang.Long) intention.evaluate(predicate.getTerm(0)),
												(java.lang.Long) intention.evaluate(predicate.getTerm(1)),
												(java.lang.String) intention.evaluate(predicate.getTerm(2)),
												(java.lang.String) intention.evaluate(predicate.getTerm(3))
											);
										}
									}
								)
							}
						)
					),
					new ModuleCall("r",
						"VacBot", new int[] {89,8,89,29},
						new Predicate("updateBoundary", new Term[] {
							Primitive.newPrimitive(7l),
							Primitive.newPrimitive(4l)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((Routing) intention.getModule("VacBot","r")).updateBoundary(
									(java.lang.Long) intention.evaluate(predicate.getTerm(0)),
									(java.lang.Long) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new Declaration(
						new Variable(Type.LONG, "maxX"),
						"VacBot", new int[] {90,8,93,5},
						new ModuleTerm("r", Type.LONG,
							new Predicate("maxX", new Term[] {}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((Routing) intention.getModule("VacBot","r")).maxX(
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((Routing) visitor.agent().getModule("VacBot","r")).maxX(
									);
								}
							}
						)
					),
					new Declaration(
						new Variable(Type.LONG, "maxY"),
						"VacBot", new int[] {91,8,93,5},
						new ModuleTerm("r", Type.LONG,
							new Predicate("maxY", new Term[] {}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((Routing) intention.getModule("VacBot","r")).maxY(
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((Routing) visitor.agent().getModule("VacBot","r")).maxY(
									);
								}
							}
						)
					),
					new ModuleCall("C",
						"VacBot", new int[] {92,8,92,37},
						new Predicate("println", new Term[] {
							Primitive.newPrimitive("Boundary Updated")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("VacBot","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {95,9,95,42},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new Predicate("route", new Term[] {
				new ListTerm(new Term[] {

				})
			}),
			new Block(
				"VacBot", new int[] {95,41,109,5},
				new Statement[] {
					new Subgoal(
						"VacBot", new int[] {96,8,109,5},
						new Goal(
							new Predicate("update", new Term[] {})
						)
					),
					new Query(
						"VacBot", new int[] {97,8,97,40},
						new Predicate("location", new Term[] {
							new Variable(Type.LONG, "sx",false),
							new Variable(Type.LONG, "sy",false)
						})
					),
					new Declaration(
						new Variable(Type.LONG, "tx"),
						"VacBot", new int[] {99,8,109,5},
						Operator.newOperator('*',
							new Brackets(
								Operator.newOperator('%',
									new ModuleTerm("m", Type.INTEGER,
										new Predicate("randomInt", new Term[] {}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.Math) intention.getModule("VacBot","m")).randomInt(
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.Math) visitor.agent().getModule("VacBot","m")).randomInt(
												);
											}
										}
									),
									new ModuleTerm("r", Type.LONG,
										new Predicate("maxX", new Term[] {}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((Routing) intention.getModule("VacBot","r")).maxX(
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((Routing) visitor.agent().getModule("VacBot","r")).maxX(
												);
											}
										}
									)
								)
							),
							Primitive.newPrimitive(1l)
						)
					),
					new Declaration(
						new Variable(Type.LONG, "ty"),
						"VacBot", new int[] {100,8,109,5},
						Operator.newOperator('*',
							new Brackets(
								Operator.newOperator('%',
									new ModuleTerm("m", Type.INTEGER,
										new Predicate("randomInt", new Term[] {}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((astra.lang.Math) intention.getModule("VacBot","m")).randomInt(
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((astra.lang.Math) visitor.agent().getModule("VacBot","m")).randomInt(
												);
											}
										}
									),
									new ModuleTerm("r", Type.LONG,
										new Predicate("maxY", new Term[] {}),
										new ModuleTermAdaptor() {
											public Object invoke(Intention intention, Predicate predicate) {
												return ((Routing) intention.getModule("VacBot","r")).maxY(
												);
											}
											public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
												return ((Routing) visitor.agent().getModule("VacBot","r")).maxY(
												);
											}
										}
									)
								)
							),
							Primitive.newPrimitive(1l)
						)
					),
					new Declaration(
						new Variable(Type.LIST, "L"),
						"VacBot", new int[] {101,8,109,5},
						new ModuleTerm("r", Type.LIST,
							new Predicate("routeTo", new Term[] {
								new Variable(Type.LONG, "sx"),
								new Variable(Type.LONG, "sy"),
								new Variable(Type.LONG, "tx"),
								new Variable(Type.LONG, "ty")
							}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((Routing) intention.getModule("VacBot","r")).routeTo(
										(long) intention.evaluate(predicate.getTerm(0)),
										(long) intention.evaluate(predicate.getTerm(1)),
										(long) intention.evaluate(predicate.getTerm(2)),
										(long) intention.evaluate(predicate.getTerm(3))
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((Routing) visitor.agent().getModule("VacBot","r")).routeTo(
										(long) visitor.evaluate(predicate.getTerm(0)),
										(long) visitor.evaluate(predicate.getTerm(1)),
										(long) visitor.evaluate(predicate.getTerm(2)),
										(long) visitor.evaluate(predicate.getTerm(3))
									);
								}
							}
						)
					),
					new ModuleCall("S",
						"VacBot", new int[] {102,8,102,20},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(1000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("VacBot","S")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("C",
						"VacBot", new int[] {103,8,103,27},
						new Predicate("println", new Term[] {
							Operator.newOperator('+',
								Primitive.newPrimitive("L="),
								new Variable(Type.LIST, "L")
							)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.Console) intention.getModule("VacBot","C")).println(
									(java.lang.String) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("r",
						"VacBot", new int[] {104,8,104,22},
						new Predicate("displayMap", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((Routing) intention.getModule("VacBot","r")).displayMap(
								);
							}
						}
					),
					new BeliefUpdate('-',
						"VacBot", new int[] {106,8,109,5},
						new Predicate("route", new Term[] {
							new ListTerm(new Term[] {

							})
						})
					),
					new BeliefUpdate('+',
						"VacBot", new int[] {107,8,109,5},
						new Predicate("route", new Term[] {
							new Variable(Type.LIST, "L")
						})
					),
					new Subgoal(
						"VacBot", new int[] {108,8,109,5},
						new Goal(
							new Predicate("task", new Term[] {
								new Variable(Type.STRING, "action")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {111,9,111,53},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new Predicate("route", new Term[] {
				new ListTerm(new Term[] {
					new Variable(Type.FUNCTION, "move",false)
				})
			}),
			new Block(
				"VacBot", new int[] {111,52,114,5},
				new Statement[] {
					new BeliefUpdate('-',
						"VacBot", new int[] {112,8,114,5},
						new Predicate("route", new Term[] {
							new ListTerm(new Term[] {
								new Variable(Type.FUNCTION, "move")
							})
						})
					),
					new Subgoal(
						"VacBot", new int[] {113,8,114,5},
						new Goal(
							new Predicate("go", new Term[] {
								new Variable(Type.FUNCTION, "move"),
								new Variable(Type.STRING, "action")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {116,9,116,60},
			new GoalEvent('+',
				new Goal(
					new Predicate("task", new Term[] {
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			new Predicate("route", new Term[] {
				new ListSplitter(
					new Variable(Type.FUNCTION, "move",false),
					new Variable(Type.LIST, "L",false)
				)
			}),
			new Block(
				"VacBot", new int[] {116,59,119,5},
				new Statement[] {
					new SpecialBeliefUpdate(
						"VacBot", new int[] {117,8,119,5},
						new Predicate("route", new Term[] {
							new Variable(Type.LIST, "L")
						})
					),
					new Subgoal(
						"VacBot", new int[] {118,8,119,5},
						new Goal(
							new Predicate("go", new Term[] {
								new Variable(Type.FUNCTION, "move"),
								new Variable(Type.STRING, "action")
							})
						)
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {121,9,121,52},
			new GoalEvent('+',
				new Goal(
					new Predicate("go", new Term[] {
						new Funct("move", new Term[] {
							new Variable(Type.STRING, "direction",false)
						}),
						new Variable(Type.STRING, "action",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"VacBot", new int[] {121,51,124,5},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {122,8,122,26},
						new Predicate("move", new Term[] {
							new Variable(Type.STRING, "direction")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("VacBot","ei")).auto_action(intention,evaluate(intention,predicate));
							}
						}
					),
					new Assignment(
						new Variable(Type.STRING, "action"),
						"VacBot", new int[] {123,8,124,5},
						new Variable(Type.STRING, "direction")
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
		agent.addSensorAdaptor(new SensorAdaptor() {
			public void sense(astra.core.Agent agent) {
				((astra.lang.EIS) agent.getModule("VacBot","ei")).sense();
			}
		});

		agent.initialize(
			new Predicate("route", new Term[] {
				new ListTerm(new Term[] {

				})
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("ei",astra.lang.EIS.class,agent);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("S",astra.lang.System.class,agent);
		fragment.addModule("r",Routing.class,agent);
		fragment.addModule("m",astra.lang.Math.class,agent);
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
			astra.core.Agent agent = new VacBot().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
