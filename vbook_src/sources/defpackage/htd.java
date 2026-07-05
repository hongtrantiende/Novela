package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: htd  reason: default package */
/* loaded from: classes.dex */
public final class htd extends cud {
    public final /* synthetic */ int C;
    public final /* synthetic */ Object D;

    public /* synthetic */ htd(Object obj, int i) {
        this.C = i;
        this.D = obj;
    }

    @Override // defpackage.cud
    public final void b() {
        switch (this.C) {
            case 0:
                jtd jtdVar = ((itd) this.D).a;
                jtdVar.b.b("unlinkToDeath", new Object[0]);
                jtdVar.n.asBinder().unlinkToDeath(jtdVar.k, 0);
                jtdVar.n = null;
                jtdVar.g = false;
                return;
            default:
                synchronized (((jtd) this.D).f) {
                    try {
                        if (((jtd) this.D).l.get() > 0 && ((jtd) this.D).l.decrementAndGet() > 0) {
                            ((jtd) this.D).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        jtd jtdVar2 = (jtd) this.D;
                        if (jtdVar2.n != null) {
                            jtdVar2.b.b("Unbind from service.", new Object[0]);
                            jtd jtdVar3 = (jtd) this.D;
                            jtdVar3.a.unbindService(jtdVar3.m);
                            jtd jtdVar4 = (jtd) this.D;
                            jtdVar4.g = false;
                            jtdVar4.n = null;
                            jtdVar4.m = null;
                        }
                        ((jtd) this.D).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}
