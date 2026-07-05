package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i50  reason: default package */
/* loaded from: classes.dex */
public final class i50 {
    public boolean a;
    public boolean b;
    public boolean c;

    public /* synthetic */ i50(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public j50 a() {
        if (!this.a && (this.b || this.c)) {
            vs.k("Secondary offload attribute fields are true but primary isFormatSupported is false");
            return null;
        }
        return new j50(this);
    }
}
