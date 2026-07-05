package defpackage;

import java.lang.reflect.Member;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xx5  reason: default package */
/* loaded from: classes.dex */
public abstract class xx5 extends eze {
    public Object g;

    public abstract xx5 A(Object obj);

    public final void z(Object obj) {
        if (this.g == null) {
            this.g = obj;
            return;
        }
        Class<?> cls = getClass();
        Member m = m();
        Object obj2 = this.g;
        throw new IllegalStateException(("Instance already set for this resolver \"" + cls + "\" of \"" + m + "(" + obj2 + ")\". To prevent problems, the instance object can only be set once in a resolver, otherwise use copy() to reuse the resolver.").toString());
    }
}
