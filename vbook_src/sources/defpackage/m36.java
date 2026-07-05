package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m36  reason: default package */
/* loaded from: classes3.dex */
public abstract class m36 {
    public static final lie a = new lie(5, "COMPLETING_ALREADY", false);
    public static final lie b = new lie(5, "COMPLETING_WAITING_CHILDREN", false);
    public static final lie c = new lie(5, "COMPLETING_RETRY", false);
    public static final lie d = new lie(5, "TOO_LATE_TO_CANCEL", false);
    public static final lie e = new lie(5, "SEALED", false);
    public static final bs3 f = new bs3(false);
    public static final bs3 g = new bs3(true);

    public static final Object a(Object obj) {
        kt5 kt5Var;
        gt5 gt5Var;
        if (obj instanceof kt5) {
            kt5Var = (kt5) obj;
        } else {
            kt5Var = null;
        }
        if (kt5Var != null && (gt5Var = kt5Var.a) != null) {
            return gt5Var;
        }
        return obj;
    }
}
