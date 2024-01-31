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
		addRule(new Rule(
			"VacBot", new int[] {5,9,5,47},
			new ModuleEvent("ei",
				"$eis",
				new Predicate("event", new Term[] {
					new Funct("location", new Term[] {
						new Variable(Type.LONG, "X",false),
						new Variable(Type.LONG, "y",false)
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
				"VacBot", new int[] {5,46,5,71},
				new Statement[] {
					new Subgoal(
						"VacBot", new int[] {5,48,5,71},
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
			"VacBot", new int[] {7,9,7,59},
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
				"VacBot", new int[] {7,58,10,5},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {8,8,8,18},
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
						"VacBot", new int[] {9,8,10,5},
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
			"VacBot", new int[] {12,9,12,63},
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
				"VacBot", new int[] {12,62,15,5},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {13,8,13,26},
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
						"VacBot", new int[] {14,8,15,5},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {17,9,17,60},
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
				"VacBot", new int[] {17,59,20,5},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {18,8,18,23},
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
						"VacBot", new int[] {19,8,20,5},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {22,9,22,61},
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
				"VacBot", new int[] {22,60,25,5},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {23,8,23,24},
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
						"VacBot", new int[] {24,8,25,5},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {27,9,27,64},
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
					Primitive.newPrimitive("empty")
				}),
				new ModuleFormulaAdaptor() {
					public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
						return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
					}
				}
			),
			new Block(
				"VacBot", new int[] {27,63,30,5},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {28,8,28,26},
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
						"VacBot", new int[] {29,8,30,5},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {32,9,32,61},
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
					Primitive.newPrimitive("empty")
				}),
				new ModuleFormulaAdaptor() {
					public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
						return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
					}
				}
			),
			new Block(
				"VacBot", new int[] {32,60,35,5},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {33,8,33,23},
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
						"VacBot", new int[] {34,8,35,5},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {37,9,37,62},
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
					Primitive.newPrimitive("empty")
				}),
				new ModuleFormulaAdaptor() {
					public Formula invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
						return ((astra.lang.EIS) visitor.agent().getModule("VacBot","ei")).auto_formula((Predicate) predicate.accept(visitor));
					}
				}
			),
			new Block(
				"VacBot", new int[] {37,61,40,5},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {38,8,38,24},
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
						"VacBot", new int[] {39,8,40,5},
						Primitive.newPrimitive("move")
					)
				}
			)
		));
		addRule(new Rule(
			"VacBot", new int[] {42,9,42,34},
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
				"VacBot", new int[] {42,33,46,5},
				new Statement[] {
					new ModuleCall("ei",
						"VacBot", new int[] {43,8,43,21},
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
						"VacBot", new int[] {44,8,44,23},
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
						"VacBot", new int[] {45,8,45,37},
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
	}

	public void initialize(astra.core.Agent agent) {
		agent.addSensorAdaptor(new SensorAdaptor() {
			public void sense(astra.core.Agent agent) {
				((astra.lang.EIS) agent.getModule("VacBot","ei")).sense();
			}
		});

	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("ei",astra.lang.EIS.class,agent);
		fragment.addModule("C",astra.lang.Console.class,agent);
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
