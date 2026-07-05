package defpackage;

import java.lang.reflect.Method;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mi1  reason: default package */
/* loaded from: classes.dex */
public final class mi1 {
    public final int a;
    public final Method b;

    public mi1(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mi1) {
                mi1 mi1Var = (mi1) obj;
                if (this.a == mi1Var.a && this.b.getName().equals(mi1Var.b.getName())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
