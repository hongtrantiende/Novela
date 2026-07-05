package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w0f  reason: default package */
/* loaded from: classes.dex */
public final class w0f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1f b;

    public w0f(b1f b1fVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(b1fVar);
                this.b = b1fVar;
                return;
            default:
                Objects.requireNonNull(b1fVar);
                this.b = b1fVar;
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        b1f b1fVar = this.b;
        switch (i) {
            case 0:
                b1fVar.e = b1fVar.F;
                return;
            default:
                b1fVar.F = null;
                return;
        }
    }
}
