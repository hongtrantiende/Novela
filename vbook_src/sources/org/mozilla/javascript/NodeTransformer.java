package org.mozilla.javascript;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import org.mozilla.javascript.ast.FunctionNode;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.ScriptNode;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class NodeTransformer {
    private boolean hasFinally;
    private Deque<Node> loopEnds;
    private Deque<Node> loops;

    private static Node addBeforeCurrent(Node node, Node node2, Node node3, Node node4) {
        if (node2 == null) {
            if (node3 != node.getFirstChild()) {
                Kit.codeBug();
            }
            node.addChildToFront(node4);
            return node4;
        }
        if (node3 != node2.getNext()) {
            Kit.codeBug();
        }
        node.addChildAfter(node4, node2);
        return node4;
    }

    private static Node replaceCurrent(Node node, Node node2, Node node3, Node node4) {
        if (node2 == null) {
            if (node3 != node.getFirstChild()) {
                Kit.codeBug();
            }
            node.replaceChild(node3, node4);
            return node4;
        } else if (node2.next == node3) {
            node.replaceChildAfter(node2, node4);
            return node4;
        } else {
            node.replaceChild(node3, node4);
            return node4;
        }
    }

    private void transformCompilationUnit(ScriptNode scriptNode, boolean z) {
        this.loops = new ArrayDeque();
        this.loopEnds = new ArrayDeque();
        boolean z2 = false;
        this.hasFinally = false;
        boolean z3 = (scriptNode.getType() != 122 || ((FunctionNode) scriptNode).requiresActivation()) ? true : true;
        scriptNode.flattenSymbolTable(!z3);
        transformCompilationUnit_r(scriptNode, scriptNode, scriptNode, z3, z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0184  */
    /* JADX WARN: Type inference failed for: r13v8, types: [org.mozilla.javascript.ast.Scope] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void transformCompilationUnit_r(org.mozilla.javascript.ast.ScriptNode r19, org.mozilla.javascript.Node r20, org.mozilla.javascript.ast.Scope r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.NodeTransformer.transformCompilationUnit_r(org.mozilla.javascript.ast.ScriptNode, org.mozilla.javascript.Node, org.mozilla.javascript.ast.Scope, boolean, boolean):void");
    }

    public final void transform(ScriptNode scriptNode, boolean z, CompilerEnvirons compilerEnvirons) {
        if (compilerEnvirons.getLanguageVersion() >= 200 && scriptNode.isInStrictMode()) {
            z = true;
        }
        transformCompilationUnit(scriptNode, z);
        for (int i = 0; i != scriptNode.getFunctionCount(); i++) {
            transform(scriptNode.getFunctionNode(i), z, compilerEnvirons);
        }
    }

    public Node visitLet(boolean z, Node node, Node node2, Node node3) {
        boolean z2;
        int i;
        Node node4;
        Node node5;
        int i2;
        Node node6;
        Node node7;
        Node firstChild = node3.getFirstChild();
        Node next = firstChild.getNext();
        node3.removeChild(firstChild);
        node3.removeChild(next);
        int type = node3.getType();
        int i3 = Token.LETEXPR;
        if (type == 172) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i4 = Token.LET;
        if (z) {
            if (z2) {
                i2 = 173;
            } else {
                i2 = 143;
            }
            Node replaceCurrent = replaceCurrent(node, node2, node3, new Node(i2));
            ArrayList arrayList = new ArrayList();
            Node node8 = new Node(72);
            Node firstChild2 = firstChild.getFirstChild();
            while (firstChild2 != null) {
                if (firstChild2.getType() == i3) {
                    List list = (List) firstChild2.getProp(22);
                    Node firstChild3 = firstChild2.getFirstChild();
                    if (firstChild3.getType() == i4) {
                        if (z2) {
                            node6 = new Node(98, firstChild3.getNext(), next);
                        } else {
                            node6 = new Node((int) Token.BLOCK, new Node(Token.EXPR_VOID, firstChild3.getNext()), next);
                        }
                        if (list != null) {
                            arrayList.addAll(list);
                            for (int i5 = 0; i5 < list.size(); i5++) {
                                node8.addChildToBack(new Node(Token.VOID, Node.newNumber(0.0d)));
                            }
                        }
                        node7 = firstChild3.getFirstChild();
                    } else {
                        throw Kit.codeBug();
                    }
                } else {
                    node6 = next;
                    node7 = firstChild2;
                }
                if (node7.getType() == 44) {
                    arrayList.add(ScriptRuntime.getIndexObject(node7.getString()));
                    Node firstChild4 = node7.getFirstChild();
                    if (firstChild4 == null) {
                        firstChild4 = new Node(Token.VOID, Node.newNumber(0.0d));
                    }
                    node8.addChildToBack(firstChild4);
                    firstChild2 = firstChild2.getNext();
                    next = node6;
                    i3 = Token.LETEXPR;
                    i4 = Token.LET;
                } else {
                    throw Kit.codeBug();
                }
            }
            node8.putProp(12, arrayList.toArray());
            replaceCurrent.addChildToBack(new Node(2, node8));
            replaceCurrent.addChildToBack(new Node(Token.WITH, next));
            replaceCurrent.addChildToBack(new Node(3));
            return replaceCurrent;
        }
        if (z2) {
            i = 98;
        } else {
            i = 143;
        }
        Node replaceCurrent2 = replaceCurrent(node, node2, node3, new Node(i));
        Node node9 = new Node(98);
        Node firstChild5 = firstChild.getFirstChild();
        while (firstChild5 != null) {
            if (firstChild5.getType() == 172) {
                Node firstChild6 = firstChild5.getFirstChild();
                if (firstChild6.getType() == 167) {
                    if (z2) {
                        node4 = new Node(98, firstChild6.getNext(), next);
                    } else {
                        node4 = new Node((int) Token.BLOCK, new Node(Token.EXPR_VOID, firstChild6.getNext()), next);
                    }
                    Scope.joinScopes((Scope) firstChild5, (Scope) node3);
                    node5 = firstChild6.getFirstChild();
                } else {
                    throw Kit.codeBug();
                }
            } else {
                node4 = next;
                node5 = firstChild5;
            }
            if (node5.getType() == 44) {
                Node newString = Node.newString(node5.getString());
                newString.setScope((Scope) node3);
                Node firstChild7 = node5.getFirstChild();
                if (firstChild7 == null) {
                    firstChild7 = new Node(Token.VOID, Node.newNumber(0.0d));
                }
                node9.addChildToBack(new Node(61, newString, firstChild7));
                firstChild5 = firstChild5.getNext();
                next = node4;
            } else {
                throw Kit.codeBug();
            }
        }
        if (z2) {
            replaceCurrent2.addChildToBack(node9);
            node3.setType(98);
            replaceCurrent2.addChildToBack(node3);
            node3.addChildToBack(next);
            if (next instanceof Scope) {
                Scope scope = (Scope) next;
                Scope parentScope = scope.getParentScope();
                Scope scope2 = (Scope) node3;
                scope.setParentScope(scope2);
                scope2.setParentScope(parentScope);
                return replaceCurrent2;
            }
        } else {
            replaceCurrent2.addChildToBack(new Node(Token.EXPR_VOID, node9));
            node3.setType(Token.BLOCK);
            replaceCurrent2.addChildToBack(node3);
            node3.addChildrenToBack(next);
            if (next instanceof Scope) {
                Scope scope3 = (Scope) next;
                Scope parentScope2 = scope3.getParentScope();
                Scope scope4 = (Scope) node3;
                scope3.setParentScope(scope4);
                scope4.setParentScope(parentScope2);
            }
        }
        return replaceCurrent2;
    }

    public final void transform(ScriptNode scriptNode, CompilerEnvirons compilerEnvirons) {
        transform(scriptNode, false, compilerEnvirons);
    }

    public void visitCall(Node node, ScriptNode scriptNode) {
    }

    public void visitNew(Node node, ScriptNode scriptNode) {
    }
}
