package defpackage;

import java.util.Locale;
import java.util.UUID;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eba  reason: default package */
/* loaded from: classes.dex */
public final class eba {
    public final t9c a;
    public final r2d b;

    public eba(t9c t9cVar, r2d r2dVar) {
        t9cVar.getClass();
        r2dVar.getClass();
        this.a = t9cVar;
        this.b = r2dVar;
    }

    public final zaa a(zaa zaaVar) {
        String str;
        String str2;
        this.b.getClass();
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        String uuid = randomUUID.toString();
        uuid.getClass();
        int i = 0;
        String lowerCase = r4b.N(uuid, false, "-", "").toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (zaaVar != null && (str2 = zaaVar.b) != null) {
            str = str2;
        } else {
            str = lowerCase;
        }
        if (zaaVar != null) {
            i = zaaVar.c + 1;
        }
        this.a.getClass();
        return new zaa(i, t9c.a().b, lowerCase, str);
    }
}
