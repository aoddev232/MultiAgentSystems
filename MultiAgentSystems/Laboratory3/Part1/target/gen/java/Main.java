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
		setParents(new Class[] {Player.class});
		addRule(new Rule(
			"Main", new int[] {6,9,6,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {6,27,22,5},
				new Statement[] {
					new If(
						"Main", new int[] {7,8,22,5},
						new Predicate("winner", new Term[] {
							new Variable(Type.STRING, "X",false)
						}),
						new Block(
							"Main", new int[] {7,29,9,9},
							new Statement[] {
								new ModuleCall("C",
									"Main", new int[] {8,12,8,41},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("Player X has won")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Main","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								)
							}
						)
					),
					new If(
						"Main", new int[] {10,8,22,5},
						new Predicate("loser", new Term[] {
							new Variable(Type.STRING, "O",false)
						}),
						new Block(
							"Main", new int[] {10,28,12,9},
							new Statement[] {
								new ModuleCall("C",
									"Main", new int[] {11,12,11,42},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("Player O has lost")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Main","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								)
							}
						)
					),
					new If(
						"Main", new int[] {13,8,22,5},
						new Predicate("drawn", new Term[] {}),
						new Block(
							"Main", new int[] {13,19,15,9},
							new Statement[] {
								new ModuleCall("C",
									"Main", new int[] {14,12,14,29},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("Draw")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Main","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								)
							}
						)
					),
					new If(
						"Main", new int[] {16,8,22,5},
						new Predicate("free", new Term[] {
							new Variable(Type.INTEGER, "L",false)
						}),
						new Block(
							"Main", new int[] {16,23,18,9},
							new Statement[] {
								new ModuleCall("C",
									"Main", new int[] {17,12,17,53},
									new Predicate("println", new Term[] {
										Operator.newOperator('+',
											Primitive.newPrimitive("First free location is: "),
											new Variable(Type.INTEGER, "L")
										)
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Main","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								)
							}
						)
					),
					new If(
						"Main", new int[] {19,8,22,5},
						new NOT(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "T",false),
								new Variable(Type.INTEGER, "L",false)
							})
						),
						new Block(
							"Main", new int[] {19,37,21,9},
							new Statement[] {
								new ModuleCall("C",
									"Main", new int[] {20,12,20,45},
									new Predicate("println", new Term[] {
										Primitive.newPrimitive("Game has not Started")
									}),
									new DefaultModuleCallAdaptor() {
										public boolean inline() {
											return true;
										}

										public boolean invoke(Intention intention, Predicate predicate) {
											return ((astra.lang.Console) intention.getModule("Main","C")).println(
												(java.lang.String) intention.evaluate(predicate.getTerm(0))
											);
										}
									}
								)
							}
						)
					)
				}
			)
		));
	}

	public void initialize(astra.core.Agent agent) {
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
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
