package defpackage;

import android.graphics.ColorSpace;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.datatransport.TransportRegistrar;
import java.io.File;
import java.util.NoSuchElementException;
import org.mozilla.javascript.AccessorSlot;
import org.mozilla.javascript.LambdaSlot;
import org.mozilla.javascript.LazyLoadSlot;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Slot;
import org.mozilla.javascript.SlotMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p1a */
/* loaded from: classes.dex */
public final /* synthetic */ class p1a implements SlotMap.SlotComputer, Continuation, swa, lnc, hu1, u94, ted {
    public final /* synthetic */ int a;

    public static /* bridge */ /* synthetic */ ColorSpace f(Object obj) {
        return (ColorSpace) obj;
    }

    public static /* synthetic */ void g() {
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void h(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void i(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void k(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void l(String str) {
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void n(Throwable th) {
        throw new IllegalStateException(th);
    }

    public static /* synthetic */ void o(int i, String str) {
        throw new IllegalStateException(str + i);
    }

    @Override // defpackage.ted
    public ikc a(ps psVar) {
        return new ikc(psVar, i88.a);
    }

    @Override // defpackage.u94
    public r94[] b() {
        lac lacVar = new lac(0L);
        ms5 ms5Var = qs5.b;
        return new r94[]{new toc(1, 1, m8b.r, lacVar, new qy2(0, mm9.e))};
    }

    @Override // defpackage.swa
    public boolean c() {
        return false;
    }

    @Override // org.mozilla.javascript.SlotMap.SlotComputer
    public Slot compute(Object obj, int i, Slot slot) {
        LazyLoadSlot ensureLazySlot;
        AccessorSlot ensureAccessorSlot;
        LambdaSlot ensureLambdaSlot;
        switch (this.a) {
            case 0:
                ensureLazySlot = ScriptableObject.ensureLazySlot(obj, i, slot);
                return ensureLazySlot;
            case 1:
                ensureAccessorSlot = ScriptableObject.ensureAccessorSlot(obj, i, slot);
                return ensureAccessorSlot;
            default:
                ensureLambdaSlot = ScriptableObject.ensureLambdaSlot(obj, i, slot);
                return ensureLambdaSlot;
        }
    }

    @Override // defpackage.hu1
    public Object j(yv yvVar) {
        hnc lambda$getComponents$0;
        hnc lambda$getComponents$1;
        hnc lambda$getComponents$2;
        switch (this.a) {
            case 20:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(yvVar);
                return lambda$getComponents$0;
            case 21:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(yvVar);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(yvVar);
                return lambda$getComponents$2;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z;
        if (task.isSuccessful()) {
            ya0 ya0Var = (ya0) task.getResult();
            ox9 ox9Var = ox9.E;
            ox9Var.n("Crashlytics report successfully enqueued to DataTransport: " + ya0Var.b);
            File file = ya0Var.c;
            z = true;
            if (file.delete()) {
                ox9Var.n("Deleted report file: " + file.getPath());
            } else {
                ox9Var.D("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public /* synthetic */ p1a(int i) {
        this.a = i;
    }

    @Override // defpackage.lnc
    public void e(Exception exc) {
    }
}
