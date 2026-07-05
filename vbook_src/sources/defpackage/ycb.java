package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ycb  reason: default package */
/* loaded from: classes.dex */
public final class ycb {
    public static final iv8 b;
    public static final ycb c;
    public static final ycb d;
    public static final /* synthetic */ ycb[] e;
    public static final /* synthetic */ qu3 f;
    public final int a;

    static {
        ycb ycbVar = new ycb("WebDav", 0, 0);
        c = ycbVar;
        ycb ycbVar2 = new ycb("GoogleDrive", 1, 1);
        ycb ycbVar3 = new ycb("OneDrive", 2, 2);
        d = ycbVar3;
        ycb[] ycbVarArr = {ycbVar, ycbVar2, ycbVar3};
        e = ycbVarArr;
        f = new qu3(ycbVarArr);
        b = new iv8(4);
    }

    public ycb(String str, int i, int i2) {
        this.a = i2;
    }

    public static ycb valueOf(String str) {
        return (ycb) Enum.valueOf(ycb.class, str);
    }

    public static ycb[] values() {
        return (ycb[]) e.clone();
    }
}
