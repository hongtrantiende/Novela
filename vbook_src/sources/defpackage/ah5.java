package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ah5  reason: default package */
/* loaded from: classes3.dex */
public final class ah5 extends pv8 {
    public static final lie g = new lie(3, "Before", false);
    public static final lie h = new lie(3, "State", false);
    public static final lie i = new lie(3, "After", false);
    public static final lie j = new lie(3, "Before", false);
    public static final lie k = new lie(3, "State", false);
    public static final lie l = new lie(3, "Transform", false);
    public static final lie m = new lie(3, "Render", false);
    public static final lie n = new lie(3, "Send", false);
    public static final lie o = new lie(3, "Receive", false);
    public static final lie p = new lie(3, "Parse", false);
    public static final lie q = new lie(3, "Transform", false);
    public static final lie r = new lie(3, "State", false);
    public static final lie s = new lie(3, "After", false);
    public static final lie t = new lie(3, "Before", false);
    public static final lie u = new lie(3, "State", false);
    public static final lie v = new lie(3, "Monitoring", false);
    public static final lie w = new lie(3, "Engine", false);
    public static final lie x = new lie(3, "Receive", false);
    public final /* synthetic */ int e;
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah5(int i2) {
        super(g, h, i);
        this.e = i2;
        switch (i2) {
            case 1:
                super(j, k, l, m, n);
                this.f = true;
                return;
            case 2:
                super(o, p, q, r, s);
                this.f = true;
                return;
            case 3:
                super(t, u, v, w, x);
                this.f = true;
                return;
            default:
                this.f = true;
                return;
        }
    }

    @Override // defpackage.pv8
    public final boolean d() {
        switch (this.e) {
            case 0:
                return this.f;
            case 1:
                return this.f;
            case 2:
                return this.f;
            default:
                return this.f;
        }
    }
}
