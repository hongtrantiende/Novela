package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class KeywordLiteral extends AstNode {
    public KeywordLiteral(int i, int i2, int i3) {
        super(i, i2);
        setType(i3);
    }

    public boolean isBooleanLiteral() {
        int i = this.type;
        if (i != 50 && i != 49) {
            return false;
        }
        return true;
    }

    @Override // org.mozilla.javascript.Node
    public KeywordLiteral setType(int i) {
        if (i != 48 && i != 79 && i != 47 && i != 50 && i != 49 && i != 174) {
            vs.m(a82.j(i, "Invalid node type: "));
            return null;
        }
        this.type = i;
        return this;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(makeIndent(i));
        int type = getType();
        if (type != 79) {
            if (type != 174) {
                switch (type) {
                    case Token.NULL /* 47 */:
                        sb.append("null");
                        break;
                    case Token.THIS /* 48 */:
                        sb.append("this");
                        break;
                    case Token.FALSE /* 49 */:
                        sb.append("false");
                        break;
                    case Token.TRUE /* 50 */:
                        sb.append("true");
                        break;
                    default:
                        vs.k(a82.j(getType(), "Invalid keyword literal type: "));
                        return null;
                }
            } else {
                sb.append("debugger;\n");
            }
        } else {
            sb.append("super");
        }
        return sb.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public KeywordLiteral(int i) {
        super(i);
    }

    public KeywordLiteral(int i, int i2) {
        super(i, i2);
    }

    public KeywordLiteral() {
    }
}
