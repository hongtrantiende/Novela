package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gac  reason: default package */
/* loaded from: classes.dex */
public final class gac extends r0a implements Runnable {
    public final long C;

    public gac(long j, n42 n42Var) {
        super(n42Var, n42Var.getContext());
        this.C = j;
    }

    @Override // defpackage.l36
    public final String T() {
        return super.T() + "(timeMillis=" + this.C + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        d82 d82Var = this.e;
        ade.s(d82Var);
        i82 i82Var = (i82) d82Var.get(i82.c);
        if (i82Var != null) {
            str = i82Var.b;
        } else {
            str = null;
        }
        String t = nk2.t(this.C, "Timed out waiting for ", " ms");
        if (str != null) {
            StringBuilder o = a82.o("Coroutine \"", str, "\" ");
            if (t.length() > 0) {
                t = Character.toLowerCase(t.charAt(0)) + t.substring(1);
            }
            o.append(t);
            t = o.toString();
        }
        s(new eac(t, this));
    }
}
