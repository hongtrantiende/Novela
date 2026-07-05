package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g02  reason: default package */
/* loaded from: classes3.dex */
public final class g02 extends w68 {
    public final String c;

    public g02(String str) {
        super(Integer.valueOf(str.length()), "the predefined string ".concat(str));
        this.c = str;
    }

    @Override // defpackage.w68
    public final x68 a(int i, String str, Object obj, int i2) {
        String obj2 = str.subSequence(i, i2).toString();
        String str2 = this.c;
        if (c16.i(obj2, str2)) {
            return null;
        }
        return new oce(str2);
    }
}
