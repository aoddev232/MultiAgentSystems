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


public class Better extends ASTRAClass {
	public Better() {
		setParents(new Class[] {Player.class});
		addRule(new Rule(
			"Better", new int[] {5,9,5,32},
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
				"Better", new int[] {5,31,7,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {6,8,7,5},
						Primitive.newPrimitive(5)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {10,9,10,107},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "P",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "O"),
							new Variable(Type.STRING, "P")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "P"),
								Primitive.newPrimitive(1)
							}),
							new AND(
								new Predicate("played", new Term[] {
									new Variable(Type.STRING, "P"),
									Primitive.newPrimitive(3)
								}),
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(2)
								})
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {10,106,12,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {11,8,12,5},
						Primitive.newPrimitive(2)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {14,9,14,107},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "P",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "O"),
							new Variable(Type.STRING, "P")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "P"),
								Primitive.newPrimitive(1)
							}),
							new AND(
								new Predicate("played", new Term[] {
									new Variable(Type.STRING, "P"),
									Primitive.newPrimitive(7)
								}),
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(4)
								})
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {14,106,16,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {15,8,16,5},
						Primitive.newPrimitive(4)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {18,9,18,107},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "P",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "O"),
							new Variable(Type.STRING, "P")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "P"),
								Primitive.newPrimitive(7)
							}),
							new AND(
								new Predicate("played", new Term[] {
									new Variable(Type.STRING, "P"),
									Primitive.newPrimitive(9)
								}),
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(8)
								})
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {18,106,20,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {19,8,20,5},
						Primitive.newPrimitive(8)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {22,9,22,107},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "P",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "O"),
							new Variable(Type.STRING, "P")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "P"),
								Primitive.newPrimitive(9)
							}),
							new AND(
								new Predicate("played", new Term[] {
									new Variable(Type.STRING, "P"),
									Primitive.newPrimitive(3)
								}),
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(6)
								})
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {22,106,24,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {23,8,24,5},
						Primitive.newPrimitive(6)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {26,9,26,107},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "P",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "O"),
							new Variable(Type.STRING, "P")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "P"),
								Primitive.newPrimitive(1)
							}),
							new AND(
								new Predicate("played", new Term[] {
									new Variable(Type.STRING, "P"),
									Primitive.newPrimitive(5)
								}),
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(9)
								})
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {26,106,28,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {27,8,28,5},
						Primitive.newPrimitive(9)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {30,9,30,107},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "P",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "O"),
							new Variable(Type.STRING, "P")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "P"),
								Primitive.newPrimitive(3)
							}),
							new AND(
								new Predicate("played", new Term[] {
									new Variable(Type.STRING, "P"),
									Primitive.newPrimitive(5)
								}),
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(7)
								})
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {30,106,32,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {31,8,32,5},
						Primitive.newPrimitive(7)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {34,9,34,107},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "P",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "O"),
							new Variable(Type.STRING, "P")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "P"),
								Primitive.newPrimitive(7)
							}),
							new AND(
								new Predicate("played", new Term[] {
									new Variable(Type.STRING, "P"),
									Primitive.newPrimitive(5)
								}),
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(3)
								})
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {34,106,36,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {35,8,36,5},
						Primitive.newPrimitive(3)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {38,9,38,107},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "P",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "O"),
							new Variable(Type.STRING, "P")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "P"),
								Primitive.newPrimitive(9)
							}),
							new AND(
								new Predicate("played", new Term[] {
									new Variable(Type.STRING, "P"),
									Primitive.newPrimitive(5)
								}),
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(1)
								})
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {38,106,40,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {39,8,40,5},
						Primitive.newPrimitive(1)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {42,9,42,107},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "P",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "O"),
							new Variable(Type.STRING, "P")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "P"),
								Primitive.newPrimitive(1)
							}),
							new AND(
								new Predicate("played", new Term[] {
									new Variable(Type.STRING, "P"),
									Primitive.newPrimitive(2)
								}),
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(3)
								})
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {42,106,44,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {43,8,44,5},
						Primitive.newPrimitive(3)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {46,9,46,107},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "P",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "O"),
							new Variable(Type.STRING, "P")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "P"),
								Primitive.newPrimitive(2)
							}),
							new AND(
								new Predicate("played", new Term[] {
									new Variable(Type.STRING, "P"),
									Primitive.newPrimitive(3)
								}),
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(1)
								})
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {46,106,48,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {47,8,48,5},
						Primitive.newPrimitive(1)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {50,9,50,107},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "P",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "O"),
							new Variable(Type.STRING, "P")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "P"),
								Primitive.newPrimitive(4)
							}),
							new AND(
								new Predicate("played", new Term[] {
									new Variable(Type.STRING, "P"),
									Primitive.newPrimitive(5)
								}),
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(6)
								})
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {50,106,52,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {51,8,52,5},
						Primitive.newPrimitive(6)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {54,9,54,107},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "P",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "O"),
							new Variable(Type.STRING, "P")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "P"),
								Primitive.newPrimitive(5)
							}),
							new AND(
								new Predicate("played", new Term[] {
									new Variable(Type.STRING, "P"),
									Primitive.newPrimitive(6)
								}),
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(4)
								})
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {54,106,56,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {55,8,56,5},
						Primitive.newPrimitive(4)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {58,9,58,107},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "P",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "O"),
							new Variable(Type.STRING, "P")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "P"),
								Primitive.newPrimitive(7)
							}),
							new AND(
								new Predicate("played", new Term[] {
									new Variable(Type.STRING, "P"),
									Primitive.newPrimitive(8)
								}),
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(9)
								})
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {58,106,60,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {59,8,60,5},
						Primitive.newPrimitive(9)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {62,9,62,107},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("player", new Term[] {
						new Variable(Type.STRING, "P",false)
					}),
					new AND(
						new Comparison("~=",
							new Variable(Type.STRING, "O"),
							new Variable(Type.STRING, "P")
						),
						new AND(
							new Predicate("played", new Term[] {
								new Variable(Type.STRING, "P"),
								Primitive.newPrimitive(8)
							}),
							new AND(
								new Predicate("played", new Term[] {
									new Variable(Type.STRING, "P"),
									Primitive.newPrimitive(9)
								}),
								new Predicate("free", new Term[] {
									Primitive.newPrimitive(7)
								})
							)
						)
					)
				)
			),
			new Block(
				"Better", new int[] {62,106,64,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {63,8,64,5},
						Primitive.newPrimitive(7)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {67,9,67,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(1)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(2)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(3)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {67,79,69,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {68,8,69,5},
						Primitive.newPrimitive(3)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {71,9,71,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(2)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(3)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(1)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {71,79,73,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {72,8,73,5},
						Primitive.newPrimitive(1)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {75,9,75,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(1)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(3)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(2)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {75,79,77,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {76,8,77,5},
						Primitive.newPrimitive(2)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {79,9,79,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(3)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(6)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(9)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {79,79,81,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {80,8,81,5},
						Primitive.newPrimitive(9)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {83,9,83,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(3)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(9)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(6)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {83,79,85,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {84,8,85,5},
						Primitive.newPrimitive(6)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {87,9,87,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(6)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(9)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(3)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {87,79,89,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {88,8,89,5},
						Primitive.newPrimitive(3)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {91,9,91,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(1)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(4)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(7)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {91,79,93,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {92,8,93,5},
						Primitive.newPrimitive(7)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {95,9,95,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(1)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(7)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(4)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {95,79,97,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {96,8,97,5},
						Primitive.newPrimitive(4)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {99,9,99,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(4)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(7)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(1)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {99,79,101,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {100,8,101,5},
						Primitive.newPrimitive(1)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {103,9,103,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(7)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(8)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(9)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {103,79,105,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {104,8,105,5},
						Primitive.newPrimitive(9)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {107,9,107,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(7)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(9)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(8)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {107,79,109,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {108,8,109,5},
						Primitive.newPrimitive(8)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {111,9,111,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(8)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(9)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(7)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {111,79,113,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {112,8,113,5},
						Primitive.newPrimitive(7)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {115,9,115,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(5)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(2)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(8)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {115,79,117,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {116,8,117,5},
						Primitive.newPrimitive(8)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {119,9,119,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(5)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(6)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(4)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {119,79,121,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {120,8,121,5},
						Primitive.newPrimitive(4)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {123,9,123,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(5)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(8)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(2)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {123,79,125,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {124,8,125,5},
						Primitive.newPrimitive(2)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {127,9,127,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(5)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(4)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(6)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {127,79,129,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {128,8,129,5},
						Primitive.newPrimitive(6)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {131,9,131,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(1)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(5)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(9)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {131,79,133,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {132,8,133,5},
						Primitive.newPrimitive(9)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {135,9,135,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(9)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(5)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(1)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {135,79,137,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {136,8,137,5},
						Primitive.newPrimitive(1)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {139,9,139,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(3)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(5)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(7)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {139,79,141,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {140,8,141,5},
						Primitive.newPrimitive(7)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {143,9,143,80},
			new GoalEvent('+',
				new Goal(
					new Predicate("move", new Term[] {
						new Variable(Type.INTEGER, "L",false)
					})
				)
			),
			new AND(
				new Predicate("o_token", new Term[] {
					new Variable(Type.STRING, "O",false)
				}),
				new AND(
					new Predicate("played", new Term[] {
						new Variable(Type.STRING, "O"),
						Primitive.newPrimitive(7)
					}),
					new AND(
						new Predicate("played", new Term[] {
							new Variable(Type.STRING, "O"),
							Primitive.newPrimitive(5)
						}),
						new Predicate("free", new Term[] {
							Primitive.newPrimitive(3)
						})
					)
				)
			),
			new Block(
				"Better", new int[] {143,79,145,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {144,8,145,5},
						Primitive.newPrimitive(3)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {151,9,151,32},
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
				"Better", new int[] {151,31,153,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {152,8,153,5},
						Primitive.newPrimitive(1)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {155,9,155,32},
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
				"Better", new int[] {155,31,157,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {156,8,157,5},
						Primitive.newPrimitive(7)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {159,9,159,32},
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
				"Better", new int[] {159,31,161,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {160,8,161,5},
						Primitive.newPrimitive(9)
					)
				}
			)
		));
		addRule(new Rule(
			"Better", new int[] {163,9,163,32},
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
				"Better", new int[] {163,31,165,5},
				new Statement[] {
					new Assignment(
						new Variable(Type.INTEGER, "L"),
						"Better", new int[] {164,8,165,5},
						Primitive.newPrimitive(3)
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
			astra.core.Agent agent = new Better().newInstance(name);
			agent.initialize(new Goal(new Predicate("main", new Term[] { argList })));
			Scheduler.schedule(agent);
		} catch (AgentCreationException e) {
			e.printStackTrace();
		} catch (ASTRAClassNotFoundException e) {
			e.printStackTrace();
		};
	}
}
