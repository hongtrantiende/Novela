package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bc7  reason: default package */
/* loaded from: classes3.dex */
public final class bc7 extends zo0 {
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final LinkedHashSet i = new LinkedHashSet();
    public final LinkedHashSet j = new LinkedHashSet();
    public final LinkedHashSet k = new LinkedHashSet();
    public final LinkedHashSet l = new LinkedHashSet();
    public final LinkedHashSet m = new LinkedHashSet();
    public final LinkedHashSet n = new LinkedHashSet();
    public final LinkedHashSet o = new LinkedHashSet();
    public final LinkedHashSet p = new LinkedHashSet();
    public final ArrayList q = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final LinkedHashSet s = new LinkedHashSet();
    public final LinkedHashSet t = new LinkedHashSet();
    public final LinkedHashSet u = new LinkedHashSet();
    public final LinkedHashSet v = new LinkedHashSet();
    public final LinkedHashSet w = new LinkedHashSet();
    public final LinkedHashSet x = new LinkedHashSet();
    public final LinkedHashSet y = new LinkedHashSet();
    public final LinkedHashSet z = new LinkedHashSet();

    @Override // defpackage.zo0
    public final Map j() {
        return o17.u(o17.u(super.j(), o17.s(new yk8("parameters", this.g), new yk8("parametersNot", this.h), new yk8("parametersCondition", null), new yk8("parameterCount", null), new yk8("parameterCountCondition", null), new yk8("typeParameters", this.i), new yk8("typeParametersNot", this.j), new yk8("exceptionTypes", this.k), new yk8("exceptionTypesNot", this.l), new yk8("genericExceptionTypes", this.m), new yk8("genericExceptionTypesNot", this.n), new yk8("genericParameters", this.o), new yk8("genericParametersNot", this.p), new yk8("isVarArgs", null), new yk8("isVarArgsNot", null), new yk8("parameterAnnotations", this.q), new yk8("parameterAnnotationsNot", this.r), new yk8("annotatedReturnType", this.s), new yk8("annotatedReturnTypeNot", this.t), new yk8("annotatedReceiverType", this.u), new yk8("annotatedReceiverTypeNot", this.v), new yk8("annotatedParameterTypes", this.w), new yk8("annotatedParameterTypesNot", this.x), new yk8("annotatedExceptionTypes", this.y), new yk8("annotatedExceptionTypesNot", this.z))), o17.s(new yk8("returnType", null), new yk8("returnTypeCondition", null), new yk8("genericReturnType", null), new yk8("genericReturnTypeCondition", null), new yk8("isBridge", null), new yk8("isBridgeNot", null), new yk8("isDefault", null), new yk8("isDefaultNot", null), new yk8("defaultValue", null), new yk8("defaultValueCondition", null)));
    }

    public final List q() {
        y67 y67Var = (y67) this.a;
        if (y67Var != null) {
            List j0 = e97.j0(this, y67Var, y67Var.a, new y74(19, this, y67Var));
            j0.getClass();
            return j0;
        }
        vs.m("You must provide a configuration to resolve the member use build(configuration).");
        return null;
    }

    public final void r(Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        ArrayList arrayList = this.g;
        arrayList.getClass();
        List asList = Arrays.asList(copyOf);
        asList.getClass();
        arrayList.addAll(asList);
    }
}
