package j$.time.temporal;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements m {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ n(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // j$.time.temporal.m
    public final l f(l lVar) {
        int i;
        int i2;
        int i3 = this.a;
        int i4 = this.b;
        switch (i3) {
            case 0:
                int h = lVar.h(ChronoField.DAY_OF_WEEK);
                if (h != i4) {
                    int i5 = h - i4;
                    if (i5 >= 0) {
                        i = 7 - i5;
                    } else {
                        i = -i5;
                    }
                    return lVar.b(i, a.DAYS);
                }
                return lVar;
            default:
                int h2 = lVar.h(ChronoField.DAY_OF_WEEK);
                if (h2 != i4) {
                    int i6 = i4 - h2;
                    if (i6 >= 0) {
                        i2 = 7 - i6;
                    } else {
                        i2 = -i6;
                    }
                    return lVar.c(i2, a.DAYS);
                }
                return lVar;
        }
    }
}
