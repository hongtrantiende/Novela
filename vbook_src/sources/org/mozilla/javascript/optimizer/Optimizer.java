package org.mozilla.javascript.optimizer;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Token;
import org.mozilla.javascript.ast.ScriptNode;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
class Optimizer {
    static final int AnyType = 3;
    static final int NoType = 0;
    static final int NumberType = 1;
    private boolean inDirectCallFunction;
    private boolean parameterUsedInNumberContext;
    OptFunctionNode theFunction;

    private static void buildStatementList_r(Node node, List<Node> list) {
        int type = node.getType();
        if (type != 143 && type != 155 && type != 146 && type != 122) {
            list.add(node);
            return;
        }
        for (Node firstChild = node.getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
            buildStatementList_r(firstChild, list);
        }
    }

    private boolean convertParameter(Node node) {
        if (this.inDirectCallFunction && node.getType() == 60) {
            if (this.theFunction.isParameter(this.theFunction.getVarIndex(node))) {
                node.removeProp(8);
                return true;
            }
            return false;
        }
        return false;
    }

    private void markDCPNumberContext(Node node) {
        if (this.inDirectCallFunction && node.getType() == 60) {
            if (this.theFunction.isParameter(this.theFunction.getVarIndex(node))) {
                this.parameterUsedInNumberContext = true;
            }
        }
    }

    private void optimizeFunction(OptFunctionNode optFunctionNode) {
        if (!optFunctionNode.fnode.requiresActivation()) {
            this.inDirectCallFunction = optFunctionNode.isTargetOfDirectCall();
            this.theFunction = optFunctionNode;
            ArrayList arrayList = new ArrayList();
            buildStatementList_r(optFunctionNode.fnode, arrayList);
            int size = arrayList.size();
            Node[] nodeArr = new Node[size];
            arrayList.toArray(nodeArr);
            Block.runFlowAnalyzes(optFunctionNode, nodeArr);
            if (!optFunctionNode.fnode.requiresActivation()) {
                this.parameterUsedInNumberContext = false;
                for (int i = 0; i < size; i++) {
                    rewriteForNumberVariables(nodeArr[i], 1);
                }
                optFunctionNode.setParameterNumberContext(this.parameterUsedInNumberContext);
            }
        }
    }

    private void rewriteAsObjectChildren(Node node, Node node2) {
        while (node2 != null) {
            Node next = node2.getNext();
            if (rewriteForNumberVariables(node2, 0) == 1 && !convertParameter(node2)) {
                node.removeChild(node2);
                Node node3 = new Node(Token.TO_OBJECT, node2);
                if (next == null) {
                    node.addChildToBack(node3);
                } else {
                    node.addChildBefore(node3, next);
                }
            }
            node2 = next;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int rewriteForNumberVariables(Node node, int i) {
        int type = node.getType();
        if (type != 39) {
            if (type != 41) {
                if (type != 43) {
                    if (type != 45) {
                        if (type != 81) {
                            if (type != 147) {
                                if (type != 154) {
                                    if (type != 170) {
                                        if (type != 60) {
                                            if (type != 61) {
                                                if (type != 119 && type != 120) {
                                                    switch (type) {
                                                        case 9:
                                                        case 10:
                                                        case 11:
                                                            break;
                                                        default:
                                                            switch (type) {
                                                                case 14:
                                                                case 15:
                                                                case 16:
                                                                case 17:
                                                                    Node firstChild = node.getFirstChild();
                                                                    Node next = firstChild.getNext();
                                                                    int rewriteForNumberVariables = rewriteForNumberVariables(firstChild, 1);
                                                                    int rewriteForNumberVariables2 = rewriteForNumberVariables(next, 1);
                                                                    markDCPNumberContext(firstChild);
                                                                    markDCPNumberContext(next);
                                                                    if (convertParameter(firstChild)) {
                                                                        if (!convertParameter(next) && rewriteForNumberVariables2 == 1) {
                                                                            node.putIntProp(8, 2);
                                                                        }
                                                                    } else if (convertParameter(next)) {
                                                                        if (rewriteForNumberVariables == 1) {
                                                                            node.putIntProp(8, 1);
                                                                        }
                                                                    } else if (rewriteForNumberVariables == 1) {
                                                                        if (rewriteForNumberVariables2 == 1) {
                                                                            node.putIntProp(8, 0);
                                                                        } else {
                                                                            node.putIntProp(8, 1);
                                                                        }
                                                                    } else if (rewriteForNumberVariables2 == 1) {
                                                                        node.putIntProp(8, 2);
                                                                    }
                                                                    return 0;
                                                                case 18:
                                                                case 19:
                                                                    break;
                                                                default:
                                                                    switch (type) {
                                                                        case 21:
                                                                            Node firstChild2 = node.getFirstChild();
                                                                            Node next2 = firstChild2.getNext();
                                                                            int rewriteForNumberVariables3 = rewriteForNumberVariables(firstChild2, 1);
                                                                            int rewriteForNumberVariables4 = rewriteForNumberVariables(next2, 1);
                                                                            if (convertParameter(firstChild2)) {
                                                                                if (!convertParameter(next2) && rewriteForNumberVariables4 == 1) {
                                                                                    node.putIntProp(8, 2);
                                                                                }
                                                                            } else if (convertParameter(next2)) {
                                                                                if (rewriteForNumberVariables3 == 1) {
                                                                                    node.putIntProp(8, 1);
                                                                                }
                                                                            } else if (rewriteForNumberVariables3 == 1) {
                                                                                if (rewriteForNumberVariables4 == 1) {
                                                                                    node.putIntProp(8, 0);
                                                                                    return 1;
                                                                                }
                                                                                node.putIntProp(8, 1);
                                                                            } else if (rewriteForNumberVariables4 == 1) {
                                                                                node.putIntProp(8, 2);
                                                                            }
                                                                            return 0;
                                                                        case 22:
                                                                        case 23:
                                                                        case 24:
                                                                        case 25:
                                                                            break;
                                                                        default:
                                                                            switch (type) {
                                                                                case 27:
                                                                                case 28:
                                                                                case 29:
                                                                                    Node firstChild3 = node.getFirstChild();
                                                                                    if (rewriteForNumberVariables(firstChild3, 1) != 1 || convertParameter(firstChild3)) {
                                                                                        return 0;
                                                                                    }
                                                                                    node.putIntProp(8, 0);
                                                                                    markDCPNumberContext(firstChild3);
                                                                                    return 1;
                                                                                default:
                                                                                    rewriteAsObjectChildren(node, node.getFirstChild());
                                                                                    return 0;
                                                                            }
                                                                    }
                                                            }
                                                    }
                                                } else {
                                                    Node firstChild4 = node.getFirstChild();
                                                    if (firstChild4.getIntProp(31, 0) == 1) {
                                                        return 0;
                                                    }
                                                    int rewriteForNumberVariables5 = rewriteForNumberVariables(firstChild4, 1);
                                                    if (firstChild4.getType() == 60) {
                                                        if (rewriteForNumberVariables5 != 1 || convertParameter(firstChild4)) {
                                                            return 0;
                                                        }
                                                        node.putIntProp(8, 0);
                                                        markDCPNumberContext(firstChild4);
                                                        return 1;
                                                    } else if (firstChild4.getType() != 39 && firstChild4.getType() != 33) {
                                                        return 0;
                                                    } else {
                                                        return rewriteForNumberVariables5;
                                                    }
                                                }
                                            }
                                        } else {
                                            int varIndex = this.theFunction.getVarIndex(node);
                                            if (this.inDirectCallFunction && this.theFunction.isParameter(varIndex) && i == 1) {
                                                node.putIntProp(8, 0);
                                                return 1;
                                            } else if (!this.theFunction.isNumberVar(varIndex)) {
                                                return 0;
                                            } else {
                                                node.putIntProp(8, 0);
                                                return 1;
                                            }
                                        }
                                    }
                                    Node next3 = node.getFirstChild().getNext();
                                    int rewriteForNumberVariables6 = rewriteForNumberVariables(next3, 1);
                                    int varIndex2 = this.theFunction.getVarIndex(node);
                                    if (this.inDirectCallFunction && this.theFunction.isParameter(varIndex2)) {
                                        if (rewriteForNumberVariables6 == 1) {
                                            if (!convertParameter(next3)) {
                                                node.putIntProp(8, 0);
                                                return 1;
                                            }
                                            markDCPNumberContext(next3);
                                            return 0;
                                        }
                                        return rewriteForNumberVariables6;
                                    } else if (this.theFunction.isNumberVar(varIndex2)) {
                                        if (rewriteForNumberVariables6 != 1) {
                                            node.removeChild(next3);
                                            node.addChildToBack(new Node(Token.TO_DOUBLE, next3));
                                        }
                                        node.putIntProp(8, 0);
                                        markDCPNumberContext(next3);
                                        return 1;
                                    } else {
                                        if (rewriteForNumberVariables6 == 1 && !convertParameter(next3)) {
                                            node.removeChild(next3);
                                            node.addChildToBack(new Node(Token.TO_OBJECT, next3));
                                        }
                                        return 0;
                                    }
                                }
                            } else {
                                if (rewriteForNumberVariables(node.getFirstChild(), 1) == 1) {
                                    node.putIntProp(8, 0);
                                }
                                return 0;
                            }
                        }
                        Node firstChild5 = node.getFirstChild();
                        Node next4 = firstChild5.getNext();
                        int rewriteForNumberVariables7 = rewriteForNumberVariables(firstChild5, 1);
                        int rewriteForNumberVariables8 = rewriteForNumberVariables(next4, 1);
                        markDCPNumberContext(firstChild5);
                        markDCPNumberContext(next4);
                        if (rewriteForNumberVariables7 == 1) {
                            if (rewriteForNumberVariables8 == 1) {
                                node.putIntProp(8, 0);
                                return 1;
                            }
                            if (!convertParameter(next4)) {
                                node.removeChild(next4);
                                node.addChildToBack(new Node(Token.TO_DOUBLE, next4));
                                node.putIntProp(8, 0);
                            }
                            return 1;
                        } else if (rewriteForNumberVariables8 == 1) {
                            if (!convertParameter(firstChild5)) {
                                node.removeChild(firstChild5);
                                node.addChildToFront(new Node(Token.TO_DOUBLE, firstChild5));
                                node.putIntProp(8, 0);
                            }
                            return 1;
                        } else {
                            return 3;
                        }
                    }
                    node.putIntProp(8, 0);
                    return 1;
                }
                Node firstChild6 = node.getFirstChild();
                rewriteAsObjectChildren(firstChild6, firstChild6.getFirstChild());
                Node next5 = firstChild6.getNext();
                if (((OptFunctionNode) node.getProp(9)) != null) {
                    while (next5 != null) {
                        if (rewriteForNumberVariables(next5, 1) == 1) {
                            markDCPNumberContext(next5);
                        }
                        next5 = next5.getNext();
                    }
                } else {
                    rewriteAsObjectChildren(node, next5);
                }
                return 0;
            }
            Node firstChild7 = node.getFirstChild();
            Node next6 = firstChild7.getNext();
            Node next7 = next6.getNext();
            if (rewriteForNumberVariables(firstChild7, 1) == 1 && !convertParameter(firstChild7)) {
                node.removeChild(firstChild7);
                node.addChildToFront(new Node(Token.TO_OBJECT, firstChild7));
            }
            if (rewriteForNumberVariables(next6, 1) == 1 && !convertParameter(next6)) {
                node.putIntProp(8, 1);
            }
            if (rewriteForNumberVariables(next7, 1) == 1 && !convertParameter(next7)) {
                node.removeChild(next7);
                node.addChildToBack(new Node(Token.TO_OBJECT, next7));
            }
            return 0;
        }
        Node firstChild8 = node.getFirstChild();
        Node next8 = firstChild8.getNext();
        if (rewriteForNumberVariables(firstChild8, 1) == 1 && !convertParameter(firstChild8)) {
            node.removeChild(firstChild8);
            node.addChildToFront(new Node(Token.TO_OBJECT, firstChild8));
        }
        if (rewriteForNumberVariables(next8, 1) == 1 && !convertParameter(next8)) {
            node.putIntProp(8, 2);
        }
        return 0;
    }

    public void optimize(ScriptNode scriptNode) {
        int functionCount = scriptNode.getFunctionCount();
        for (int i = 0; i != functionCount; i++) {
            optimizeFunction(OptFunctionNode.get(scriptNode, i));
        }
    }
}
