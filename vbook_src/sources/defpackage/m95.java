package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m95  reason: default package */
/* loaded from: classes.dex */
public final class m95 extends mq7 implements jm8 {
    public lk0 K;

    @Override // defpackage.jm8
    public final Object j(r13 r13Var, Object obj) {
        cv9 cv9Var;
        if (obj instanceof cv9) {
            cv9Var = (cv9) obj;
        } else {
            cv9Var = null;
        }
        if (cv9Var == null) {
            cv9Var = new cv9();
        }
        cv9Var.c = new hd2(this.K);
        return cv9Var;
    }
}
