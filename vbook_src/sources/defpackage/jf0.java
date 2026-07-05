package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jf0  reason: default package */
/* loaded from: classes.dex */
public final class jf0 {
    public final yz7 a;
    public final tb8 b;

    /* JADX WARN: Multi-variable type inference failed */
    public jf0(yz7 yz7Var, tb8 tb8Var) {
        this.a = yz7Var;
        this.b = tb8Var;
        if ((yz7Var == null ? tb8Var : yz7Var) != null) {
            return;
        }
        vs.m("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        throw null;
    }
}
