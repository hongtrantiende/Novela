package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zha  reason: default package */
/* loaded from: classes3.dex */
public final class zha {
    public static final zha a;
    public static final zha b;
    public static final zha c;
    public static final /* synthetic */ zha[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [zha, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [zha, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [zha, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Hidden", 0);
        a = r0;
        ?? r1 = new Enum("Expanded", 1);
        b = r1;
        ?? r2 = new Enum("PartiallyExpanded", 2);
        c = r2;
        d = new zha[]{r0, r1, r2};
    }

    public static zha valueOf(String str) {
        return (zha) Enum.valueOf(zha.class, str);
    }

    public static zha[] values() {
        return (zha[]) d.clone();
    }
}
