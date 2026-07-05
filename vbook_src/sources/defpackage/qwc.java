package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qwc  reason: default package */
/* loaded from: classes.dex */
public final class qwc extends xm8 {
    public final qs5 c;

    public qwc(String str, mm9 mm9Var) {
        super(str, null, false, 1);
        this.c = qs5.l(mm9Var);
    }

    @Override // defpackage.xm8, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        qs5 qs5Var = this.c;
        if (qs5Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + qs5Var;
    }
}
