package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d4c  reason: default package */
/* loaded from: classes3.dex */
public final class d4c {
    public final int a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final qpb h;

    public d4c(int i, String str, String str2, long j, long j2, long j3, boolean z, int i2) {
        qpb qpbVar;
        j3 = (i2 & 32) != 0 ? System.currentTimeMillis() : j3;
        z = (i2 & 64) != 0 ? true : z;
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z;
        if (str.length() == 0 && str2.length() == 0) {
            vs.m("Either pre or post text must not be empty");
            throw null;
        }
        if (str.length() == 0 && str2.length() > 0) {
            qpbVar = qpb.a;
        } else if (str.length() > 0 && str2.length() == 0) {
            qpbVar = qpb.b;
        } else {
            qpbVar = qpb.c;
        }
        this.h = qpbVar;
    }

    public final jpb a() {
        qpb qpbVar = this.h;
        qpb qpbVar2 = qpb.b;
        jpb jpbVar = jpb.d;
        if (qpbVar != qpbVar2) {
            return jpbVar;
        }
        long j = this.e;
        if (!fxb.d(j)) {
            return jpbVar;
        }
        long j2 = this.d;
        if (fxb.d(j2)) {
            if (((int) (j2 >> 32)) > ((int) (j >> 32))) {
                return jpb.a;
            }
            return jpb.b;
        } else if (((int) (j2 >> 32)) == ((int) (j >> 32)) && ((int) (j2 >> 32)) == this.a) {
            return jpb.c;
        } else {
            return jpbVar;
        }
    }
}
