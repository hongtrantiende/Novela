package defpackage;

import android.net.Uri;
import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ca  reason: default package */
/* loaded from: classes3.dex */
public final class ca extends aab implements lu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ca(Object obj, Object obj2, Object obj3, Object obj4, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ca caVar = new ca((ka) obj4, (hn8) obj3, (fb) obj2, m42Var, 0);
                caVar.b = obj;
                return caVar;
            case 1:
                return new ca((AndroidTextToSpeechService) this.b, (String) obj4, (String) obj3, (jj) obj2, m42Var, 1);
            case 2:
                return new ca((aw7) this.b, (aw7) obj4, (aw7) obj3, (aw7) obj2, m42Var, 2);
            case 3:
                ca caVar2 = new ca((d19) obj4, (npb) obj3, (gtb) obj2, m42Var, 3);
                caVar2.b = obj;
                return caVar2;
            case 4:
                return new ca((ddd) this.b, (rk9) obj4, (cs5) obj3, (rk9) obj2, m42Var, 4);
            case 5:
                return new ca((eb5) this.b, (Uri) obj4, (String) obj3, (kr8) obj2, m42Var, 5);
            case 6:
                return new ca((cyb) this.b, (ymb) obj4, (aw7) obj3, (aw7) obj2, m42Var, 6);
            case 7:
                return new ca((n6c) this.b, (String) obj4, (mv) obj3, (String) obj2, m42Var, 7);
            case 8:
                return new ca((d3d) this.b, (String) obj4, (gn8) obj3, (cs9) obj2, m42Var, 8);
            case 9:
                return new ca((s3d) this.b, (String) obj4, (gn8) obj3, (cs9) obj2, m42Var, 9);
            default:
                return new ca((vfb) this.b, (aw7) obj4, (aw7) obj3, (aw7) obj2, m42Var, 10);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((ca) create((l9) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((ca) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((ca) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((ca) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 4:
                ((ca) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 5:
                return ((ca) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                ((ca) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 7:
                ((ca) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 8:
                ((ca) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 9:
                ((ca) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((ca) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:199:0x04b7, code lost:
        if (r3 == null) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x04cb, code lost:
        if (r3 == null) goto L218;
     */
    /* JADX WARN: Type inference failed for: r5v1, types: [my0, java.lang.Object] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ca.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ca(Object obj, Object obj2, Object obj3, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
