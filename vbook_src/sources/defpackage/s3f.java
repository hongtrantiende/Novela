package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s3f  reason: default package */
/* loaded from: classes.dex */
public final class s3f implements Runnable {
    public final long a;
    public final long b;
    public final /* synthetic */ hvc c;

    public s3f(hvc hvcVar, long j, long j2) {
        Objects.requireNonNull(hvcVar);
        this.c = hvcVar;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ete eteVar = ((lte) ((f4f) this.c.c).a).C;
        lte.m(eteVar);
        eteVar.g0(new og(this, 20));
    }
}
