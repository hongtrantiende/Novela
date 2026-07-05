package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xw2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xw2 implements yi4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xw2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yi4
    public final float invoke() {
        cgc e;
        cgc e2;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                bgc bgcVar = ((qma) obj).k;
                if (bgcVar == null || (e = bgcVar.e()) == null) {
                    return nae.e;
                }
                return e.d.h();
            default:
                bgc bgcVar2 = ((crc) obj).o;
                if (bgcVar2 == null || (e2 = bgcVar2.e()) == null) {
                    return nae.e;
                }
                return e2.d.h();
        }
    }
}
