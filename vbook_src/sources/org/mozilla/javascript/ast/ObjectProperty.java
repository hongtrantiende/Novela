package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class ObjectProperty extends InfixExpression {
    private boolean shorthand;

    public ObjectProperty() {
        this.type = Token.COLON;
    }

    public boolean isGetterMethod() {
        if (this.type == 165) {
            return true;
        }
        return false;
    }

    public boolean isMethod() {
        if (!isGetterMethod() && !isSetterMethod() && !isNormalMethod()) {
            return false;
        }
        return true;
    }

    public boolean isNormalMethod() {
        if (this.type == 177) {
            return true;
        }
        return false;
    }

    public boolean isSetterMethod() {
        if (this.type == 166) {
            return true;
        }
        return false;
    }

    public boolean isShorthand() {
        return this.shorthand;
    }

    public void setIsGetterMethod() {
        this.type = Token.GET;
    }

    public void setIsNormalMethod() {
        this.type = Token.METHOD;
    }

    public void setIsSetterMethod() {
        this.type = Token.SET;
    }

    public void setIsShorthand(boolean z) {
        this.shorthand = z;
    }

    public void setNodeType(int i) {
        if (i != 116 && i != 165 && i != 166 && i != 177) {
            vs.m(a82.j(i, "invalid node type: "));
        } else {
            setType(i);
        }
    }

    @Override // org.mozilla.javascript.ast.InfixExpression, org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = i + 1;
        sb.append(makeIndent(i2));
        if (isGetterMethod()) {
            sb.append("get ");
        } else if (isSetterMethod()) {
            sb.append("set ");
        }
        AstNode astNode = this.left;
        if (getType() == 116) {
            i = 0;
        }
        sb.append(astNode.toSource(i));
        if (!this.shorthand) {
            if (this.type == 116) {
                sb.append(": ");
            }
            AstNode astNode2 = this.right;
            if (getType() == 116) {
                i2 = 0;
            }
            sb.append(astNode2.toSource(i2));
        }
        return sb.toString();
    }

    public ObjectProperty(int i) {
        super(i);
        this.type = Token.COLON;
    }

    public ObjectProperty(int i, int i2) {
        super(i, i2);
        this.type = Token.COLON;
    }
}
