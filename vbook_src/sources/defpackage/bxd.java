package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bxd  reason: default package */
/* loaded from: classes.dex */
public final class bxd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ gge d;

    public /* synthetic */ bxd(gge ggeVar, String str, long j, int i) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = ggeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        String str = this.b;
        gge ggeVar = this.d;
        switch (i) {
            case 0:
                ggeVar.W();
                am8.p(str);
                yz yzVar = ggeVar.c;
                if (yzVar.isEmpty()) {
                    ggeVar.d = j;
                }
                Integer num = (Integer) yzVar.get(str);
                if (num != null) {
                    yzVar.put(str, Integer.valueOf(num.intValue() + 1));
                    return;
                } else if (yzVar.c >= 100) {
                    ppe ppeVar = ((lte) ggeVar.a).f;
                    lte.m(ppeVar);
                    ppeVar.E.e("Too many ads visible");
                    return;
                } else {
                    yzVar.put(str, 1);
                    ggeVar.b.put(str, Long.valueOf(j));
                    return;
                }
            default:
                ggeVar.W();
                am8.p(str);
                yz yzVar2 = ggeVar.c;
                Integer num2 = (Integer) yzVar2.get(str);
                lte lteVar = (lte) ggeVar.a;
                if (num2 != null) {
                    b1f b1fVar = lteVar.H;
                    ppe ppeVar2 = lteVar.f;
                    lte.l(b1fVar);
                    s0f b0 = b1fVar.b0(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue == 0) {
                        yzVar2.remove(str);
                        yz yzVar3 = ggeVar.b;
                        Long l = (Long) yzVar3.get(str);
                        if (l == null) {
                            lte.m(ppeVar2);
                            ppeVar2.f.e("First ad unit exposure time was never set");
                        } else {
                            yzVar3.remove(str);
                            ggeVar.c0(str, j - l.longValue(), b0);
                        }
                        if (yzVar2.isEmpty()) {
                            long j2 = ggeVar.d;
                            if (j2 == 0) {
                                lte.m(ppeVar2);
                                ppeVar2.f.e("First ad exposure time was never set");
                                return;
                            }
                            ggeVar.b0(j - j2, b0);
                            ggeVar.d = 0L;
                            return;
                        }
                        return;
                    }
                    yzVar2.put(str, Integer.valueOf(intValue));
                    return;
                }
                ppe ppeVar3 = lteVar.f;
                lte.m(ppeVar3);
                ppeVar3.f.f(str, "Call to endAdUnitExposure for unknown ad unit id");
                return;
        }
    }
}
