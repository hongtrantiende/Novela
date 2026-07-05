package defpackage;

import android.os.Bundle;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qxe  reason: default package */
/* loaded from: classes.dex */
public final class qxe implements Runnable {
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ yze E;
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ boolean f;

    public qxe(yze yzeVar, String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bundle;
        this.f = z;
        this.C = z2;
        this.D = z3;
        this.E = yzeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.E.g0(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D);
    }
}
