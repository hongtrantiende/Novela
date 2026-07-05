package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d7a  reason: default package */
/* loaded from: classes.dex */
public abstract class d7a {
    public static final gs a = new gs(Float.NaN, Float.NaN);
    public static final drc b = new drc(new az9(24), new az9(25));
    public static final long c;
    public static final gxa d;

    static {
        long floatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L);
        c = floatToRawIntBits;
        d = new gxa(new y78(floatToRawIntBits), 3);
    }
}
