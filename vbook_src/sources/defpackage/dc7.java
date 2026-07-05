package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dc7  reason: default package */
/* loaded from: classes.dex */
public final class dc7 extends xx5 {
    public final Method h;

    public dc7(Method method) {
        this.h = method;
    }

    @Override // defpackage.xx5
    public final xx5 A(Object obj) {
        z(obj);
        return this;
    }

    @Override // defpackage.eze
    public final Member m() {
        return this.h;
    }
}
