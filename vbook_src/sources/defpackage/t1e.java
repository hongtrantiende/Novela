package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t1e  reason: default package */
/* loaded from: classes.dex */
public final class t1e extends Exception {
    public final jz1 a;

    public t1e(jz1 jz1Var) {
        boolean z;
        if (jz1Var.b != 0 && jz1Var.c != null) {
            z = true;
        } else {
            z = false;
        }
        am8.m("ResolvableConnectionException can only be created with a connection result containing a resolution.", z);
        this.a = jz1Var;
    }
}
