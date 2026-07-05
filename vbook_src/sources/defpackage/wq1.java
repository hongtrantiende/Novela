package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wq1  reason: default package */
/* loaded from: classes.dex */
public final class wq1 extends hw6 {
    @Override // defpackage.hw6
    public final void a(iea ieaVar, String str, String str2, Throwable th) {
        str.getClass();
        str2.getClass();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ieaVar);
        sb2.append(':');
        sb.append(sb2.toString());
        sb.append(" ");
        if (str2.length() > 0) {
            sb.append("(" + str2 + ')');
            sb.append(" ");
        }
        sb.append(str);
        System.out.println((Object) sb.toString());
        if (th != null) {
            th.printStackTrace();
        }
    }
}
