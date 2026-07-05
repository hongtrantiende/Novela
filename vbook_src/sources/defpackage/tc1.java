package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tc1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tc1 implements xt4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ char[] b;

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        char[] cArr = this.b;
        char charValue = ((Character) obj).charValue();
        switch (i) {
            case 0:
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (charValue != cArr[i2]) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                if (i2 < 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                int length2 = cArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        if (charValue != cArr[i3]) {
                            i3++;
                        }
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
