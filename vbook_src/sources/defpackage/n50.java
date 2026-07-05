package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n50  reason: default package */
/* loaded from: classes.dex */
public final class n50 {
    public int a = 0;
    public boolean b;
    public boolean c;
    public boolean d;

    public o50 a() {
        if (!this.b && (this.c || this.d)) {
            vs.k("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
            return null;
        }
        return new o50(this);
    }
}
