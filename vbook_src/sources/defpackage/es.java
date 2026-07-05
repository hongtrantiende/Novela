package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: es  reason: default package */
/* loaded from: classes.dex */
public final class es implements yya {
    public final drc a;
    public final hm8 b;
    public js c;
    public long d;
    public long e;
    public boolean f;

    public es(drc drcVar, Object obj, js jsVar, long j, long j2, boolean z) {
        js jsVar2;
        this.a = drcVar;
        this.b = yae.z(obj);
        if (jsVar != null) {
            jsVar2 = bue.e(jsVar);
        } else {
            jsVar2 = (js) drcVar.a.invoke(obj);
            jsVar2.d();
        }
        this.c = jsVar2;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public final Object a() {
        return this.a.b.invoke(this.c);
    }

    @Override // defpackage.yya
    public final Object getValue() {
        return this.b.getValue();
    }

    public final String toString() {
        Object value = this.b.getValue();
        Object a = a();
        boolean z = this.f;
        long j = this.d;
        long j2 = this.e;
        StringBuilder sb = new StringBuilder("AnimationState(value=");
        sb.append(value);
        sb.append(", velocity=");
        sb.append(a);
        sb.append(", isRunning=");
        sb.append(z);
        sb.append(", lastFrameTimeNanos=");
        sb.append(j);
        return a82.n(sb, ", finishedTimeNanos=", j2, ")");
    }

    public /* synthetic */ es(drc drcVar, Object obj, js jsVar, int i) {
        this(drcVar, obj, (i & 4) != 0 ? null : jsVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
