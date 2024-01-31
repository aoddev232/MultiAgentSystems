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
			"Main", new int[] {7,9,7,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {7,27,23,5},
				new Statement[] {
					new ModuleCall("ei",
						"Main", new int[] {8,8,8,58},
						new Predicate("launch", new Term[] {
							Primitive.newPrimitive("hw"),
							Primitive.newPrimitive("dependency/vacuumworld-1.2.0.jar")
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).launch(
									(java.lang.String) intention.evaluate(predicate.getTerm(0)),
									(java.lang.String) intention.evaluate(predicate.getTerm(1))
								);
							}
						}
					),
					new ModuleCall("ei",
						"Main", new int[] {10,8,10,47},
						new Predicate("init", new Term[] {
							new ListTerm(new Term[] {
								new Funct("generation", new Term[] {
									Primitive.newPrimitive("no")
								}),
								new Funct("level", new Term[] {
									Primitive.newPrimitive("4")
								})
							})
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).init(
									(astra.term.ListTerm) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("ei",
						"Main", new int[] {12,8,12,18},
						new Predicate("start", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.EIS) intention.getModule("Main","ei")).start(
								);
							}
						}
					),
					new Declaration(
						new Variable(Type.LIST, "entities"),
						"Main", new int[] {14,8,23,5},
						new ModuleTerm("ei", Type.LIST,
							new Predicate("freeEntities", new Term[] {}),
							new ModuleTermAdaptor() {
								public Object invoke(Intention intention, Predicate predicate) {
									return ((astra.lang.EIS) intention.getModule("Main","ei")).freeEntities(
									);
								}
								public Object invoke(BindingsEvaluateVisitor visitor, Predicate predicate) {
									return ((astra.lang.EIS) visitor.agent().getModule("Main","ei")).freeEntities(
									);
								}
							}
						)
					),
					new ForAll(
						"Main", new int[] {15,8,15,40},
						new Variable(Type.STRING, "entity",false),
						new Variable(Type.LIST, "entities"),
						new Block(
							"Main", new int[] {15,41,23,5},
							new Statement[] {
								new ModuleCall("S",
									"Main", new int[] {16,12,16,43},
									new Predicate("createAgent", new Term[] {
										new Variable(Type.STRING, "entity"),
										Primitive.newPrimitive("VacBot")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.System) intention.getModule("Main","S")).createAgent(
												(java.lang.String) intention.evaluate(predicate.getTerm(0)),
												(java.lang.String) intention.evaluate(predicate.getTerm(1))
											);
										}
									}
								),
								new ModuleCall("S",
									"Main", new int[] {17,12,17,43},
									new Predicate("setMainGoal", new Term[] {
										new Variable(Type.STRING, "entity"),
										new ListTerm(new Term[] {
											new Variable(Type.STRING, "entity")
										})
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.System) intention.getModule("Main","S")).setMainGoal(
												(java.lang.String) intention.evaluate(predicate.getTerm(0)),
												(astra.term.ListTerm) intention.evaluate(predicate.getTerm(1))
											);
										}
									}
								)
							}
						)
					),
					new ModuleCall("S",
						"Main", new int[] {21,8,21,21},
						new Predicate("sleep", new Term[] {
							Primitive.newPrimitive(30000)
						}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return false;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","S")).sleep(
									(java.lang.Integer) intention.evaluate(predicate.getTerm(0))
								);
							}
						}
					),
					new ModuleCall("S",
						"Main", new int[] {22,8,22,16},
						new Predicate("exit", new Term[] {}),
						new DefaultModuleCallAdaptor() {
							public boolean inline() {
								return true;
							}

							public boolean invoke(Intention intention, Predicate predicate) {
								return ((astra.lang.System) intention.getModule("Main","S")).exit(
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
				((astra.lang.EIS) agent.getModule("Main","ei")).sense();
			}
		});

	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("ei",astra.lang.EIS.class,agent);
		fragment.addModule("C",astra.lang.Console.class,agent);
		fragment.addModule("S",astra.lang.System.class,agent);
		fragment.addModule("Routing",Routing.class,agent);
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
