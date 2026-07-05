package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: znd  reason: default package */
/* loaded from: classes3.dex */
public final class znd {
    public static final /* synthetic */ znd[] C;
    public static final /* synthetic */ qu3 D;
    public static final znd c;
    public static final znd d;
    public static final znd e;
    public static final znd f;
    public final char a;
    public final char b;

    static {
        znd zndVar = new znd("OBJ", 0, '{', '}');
        c = zndVar;
        znd zndVar2 = new znd("LIST", 1, '[', ']');
        d = zndVar2;
        znd zndVar3 = new znd("MAP", 2, '{', '}');
        e = zndVar3;
        znd zndVar4 = new znd("POLY_OBJ", 3, '[', ']');
        f = zndVar4;
        znd[] zndVarArr = {zndVar, zndVar2, zndVar3, zndVar4};
        C = zndVarArr;
        D = new qu3(zndVarArr);
    }

    public znd(String str, int i, char c2, char c3) {
        this.a = c2;
        this.b = c3;
    }

    public static znd valueOf(String str) {
        return (znd) Enum.valueOf(znd.class, str);
    }

    public static znd[] values() {
        return (znd[]) C.clone();
    }
}
