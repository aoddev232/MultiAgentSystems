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
			"Main", new int[] {11,9,11,47},
			new BeliefEvent('+',
				new Predicate("switch", new Term[] {
					new Variable(Type.STRING, "switch",false),
					new Variable(Type.STRING, "state",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {11,46,13,5},
				new Statement[] {
					new Subgoal(
						"Main", new int[] {12,8,13,5},
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
			"Main", new int[] {15,9,15,68},
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
				"Main", new int[] {15,67,15,69},
				new Statement[] {
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {17,9,17,76},
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
				"Main", new int[] {17,75,20,5},
				new Statement[] {
					new BeliefUpdate('-',
						"Main", new int[] {18,8,20,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "lname"),
							new Variable(Type.STRING, "state2")
						})
					),
					new BeliefUpdate('+',
						"Main", new int[] {19,8,20,5},
						new Predicate("light", new Term[] {
							new Variable(Type.STRING, "lname"),
							new Variable(Type.STRING, "state")
						})
					)
				}
			)
		));
		addRule(new Rule(
			"Main", new int[] {22,9,22,44},
			new BeliefEvent('+',
				new Predicate("light", new Term[] {
					new Variable(Type.STRING, "lname",false),
					new Variable(Type.STRING, "state",false)
				})
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {22,43,24,5},
				new Statement[] {
					new ModuleCall("c",
						"Main", new int[] {23,8,23,63},
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
			"Main", new int[] {26,9,26,28},
			new GoalEvent('+',
				new Goal(
					new Predicate("main", new Term[] {
						new Variable(Type.LIST, "args",false)
					})
				)
			),
			Predicate.TRUE,
			new Block(
				"Main", new int[] {26,27,28,5},
				new Statement[] {
					new BeliefUpdate('+',
						"Main", new int[] {27,8,28,5},
						new Predicate("switch", new Term[] {
							Primitive.newPrimitive("s1"),
							Primitive.newPrimitive("on")
						})
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
				Primitive.newPrimitive("on")
			})
		);
	}

	public Fragment createFragment(astra.core.Agent agent) throws ASTRAClassNotFoundException {
		Fragment fragment = new Fragment(this);
		fragment.addModule("c",astra.lang.Console.class,agent);
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
