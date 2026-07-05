package defpackage;

import java.util.Arrays;
import java.util.Comparator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fae  reason: default package */
/* loaded from: classes.dex */
public final class fae implements Comparator {
    public final /* synthetic */ l5e a;
    public final /* synthetic */ odd b;

    public fae(l5e l5eVar, odd oddVar) {
        this.a = l5eVar;
        this.b = oddVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        e9e e9eVar = (e9e) obj;
        e9e e9eVar2 = (e9e) obj2;
        if (e9eVar instanceof r9e) {
            if (e9eVar2 instanceof r9e) {
                return 0;
            }
            return 1;
        } else if (e9eVar2 instanceof r9e) {
            return -1;
        } else {
            l5e l5eVar = this.a;
            if (l5eVar == null) {
                return e9eVar.zzc().compareTo(e9eVar2.zzc());
            }
            return (int) yae.R(l5eVar.g(this.b, Arrays.asList(e9eVar, e9eVar2)).zzd().doubleValue());
        }
    }
}
