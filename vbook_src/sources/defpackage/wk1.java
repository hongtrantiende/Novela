package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wk1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class wk1 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StringBuilder b;

    public /* synthetic */ wk1(int i, StringBuilder sb) {
        this.a = i;
        this.b = sb;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        StringBuilder sb = this.b;
        switch (i) {
            case 0:
                Byte b = (Byte) obj;
                byte byteValue = b.byteValue();
                if (byteValue == 32) {
                    sb.append("%20");
                } else if (!xk1.a.contains(b) && !xk1.c.contains(b)) {
                    sb.append(xk1.g(byteValue));
                } else {
                    sb.append((char) byteValue);
                }
                return pvcVar;
            default:
                String str = (String) obj;
                str.getClass();
                sb.append(str);
                sb.append("\n");
                return pvcVar;
        }
    }
}
