package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zb4  reason: default package */
/* loaded from: classes.dex */
public final class zb4 extends zo0 {
    @Override // defpackage.zo0
    public final Map j() {
        return o17.u(super.j(), o17.s(new yk8("isEnumConstant", null), new yk8("isEnumConstantNot", null), new yk8("type", null), new yk8("typeCondition", null), new yk8("genericType", null), new yk8("genericTypeCondition", null)));
    }

    public final List q() {
        y67 y67Var = (y67) this.a;
        if (y67Var != null) {
            List j0 = e97.j0(this, y67Var, y67Var.a, new y74(20, this, y67Var));
            j0.getClass();
            return j0;
        }
        vs.m("You must provide a configuration to resolve the member use build(configuration).");
        return null;
    }
}
