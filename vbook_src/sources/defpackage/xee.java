package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xee  reason: default package */
/* loaded from: classes.dex */
public abstract class xee extends tbe implements yee {
    /* JADX WARN: Type inference failed for: r1v1, types: [ftd, yee] */
    public static yee asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof yee) {
            return (yee) queryLocalInterface;
        }
        return new ftd(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v28, types: [ftd] */
    /* JADX WARN: Type inference failed for: r6v84, types: [ftd] */
    @Override // defpackage.tbe
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9 = false;
        hfe hfeVar = null;
        sfe sfeVar = null;
        hfe hfeVar2 = null;
        hfe hfeVar3 = null;
        hfe hfeVar4 = null;
        hfe hfeVar5 = null;
        age ageVar = null;
        age ageVar2 = null;
        age ageVar3 = null;
        hfe hfeVar6 = null;
        hfe hfeVar7 = null;
        hfe hfeVar8 = null;
        hfe hfeVar9 = null;
        hfe hfeVar10 = null;
        hfe hfeVar11 = null;
        uge ugeVar = null;
        hfe hfeVar12 = null;
        hfe hfeVar13 = null;
        hfe hfeVar14 = null;
        hfe hfeVar15 = null;
        hfe hfeVar16 = null;
        switch (i) {
            case 1:
                long readLong = parcel.readLong();
                wbe.d(parcel);
                initialize(n78.T(parcel.readStrongBinder()), (xge) wbe.a(parcel, xge.CREATOR), readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) wbe.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                long readLong2 = parcel.readLong();
                wbe.d(parcel);
                logEvent(readString, readString2, bundle, z, z2, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) wbe.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof hfe) {
                        hfeVar = (hfe) queryLocalInterface;
                    } else {
                        hfeVar = new cfe(readStrongBinder);
                    }
                }
                hfe hfeVar17 = hfeVar;
                long readLong3 = parcel.readLong();
                wbe.d(parcel);
                logEventAndBundle(readString3, readString4, bundle2, hfeVar17, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                yj5 T = n78.T(parcel.readStrongBinder());
                ClassLoader classLoader = wbe.a;
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                long readLong4 = parcel.readLong();
                wbe.d(parcel);
                setUserProperty(readString5, readString6, T, z3, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                ClassLoader classLoader2 = wbe.a;
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof hfe) {
                        hfeVar16 = (hfe) queryLocalInterface2;
                    } else {
                        hfeVar16 = new cfe(readStrongBinder2);
                    }
                }
                wbe.d(parcel);
                getUserProperties(readString7, readString8, z4, hfeVar16);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof hfe) {
                        hfeVar15 = (hfe) queryLocalInterface3;
                    } else {
                        hfeVar15 = new cfe(readStrongBinder3);
                    }
                }
                wbe.d(parcel);
                getMaxUserProperties(readString9, hfeVar15);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                wbe.d(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                long readLong6 = parcel.readLong();
                wbe.d(parcel);
                setConditionalUserProperty((Bundle) wbe.a(parcel, Bundle.CREATOR), readLong6);
                break;
            case 9:
                wbe.d(parcel);
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) wbe.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof hfe) {
                        hfeVar14 = (hfe) queryLocalInterface4;
                    } else {
                        hfeVar14 = new cfe(readStrongBinder4);
                    }
                }
                wbe.d(parcel);
                getConditionalUserProperties(readString11, readString12, hfeVar14);
                break;
            case 11:
                ClassLoader classLoader3 = wbe.a;
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                long readLong7 = parcel.readLong();
                wbe.d(parcel);
                setMeasurementEnabled(z5, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                wbe.d(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                wbe.d(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                wbe.d(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                yj5 T2 = n78.T(parcel.readStrongBinder());
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                long readLong11 = parcel.readLong();
                wbe.d(parcel);
                setCurrentScreen(T2, readString13, readString14, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof hfe) {
                        hfeVar13 = (hfe) queryLocalInterface5;
                    } else {
                        hfeVar13 = new cfe(readStrongBinder5);
                    }
                }
                wbe.d(parcel);
                getCurrentScreenName(hfeVar13);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof hfe) {
                        hfeVar12 = (hfe) queryLocalInterface6;
                    } else {
                        hfeVar12 = new cfe(readStrongBinder6);
                    }
                }
                wbe.d(parcel);
                getCurrentScreenClass(hfeVar12);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof uge) {
                        ugeVar = (uge) queryLocalInterface7;
                    } else {
                        ugeVar = new ftd(readStrongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 4);
                    }
                }
                wbe.d(parcel);
                setInstanceIdProvider(ugeVar);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof hfe) {
                        hfeVar11 = (hfe) queryLocalInterface8;
                    } else {
                        hfeVar11 = new cfe(readStrongBinder8);
                    }
                }
                wbe.d(parcel);
                getCachedAppInstanceId(hfeVar11);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof hfe) {
                        hfeVar10 = (hfe) queryLocalInterface9;
                    } else {
                        hfeVar10 = new cfe(readStrongBinder9);
                    }
                }
                wbe.d(parcel);
                getAppInstanceId(hfeVar10);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof hfe) {
                        hfeVar9 = (hfe) queryLocalInterface10;
                    } else {
                        hfeVar9 = new cfe(readStrongBinder10);
                    }
                }
                wbe.d(parcel);
                getGmpAppId(hfeVar9);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof hfe) {
                        hfeVar8 = (hfe) queryLocalInterface11;
                    } else {
                        hfeVar8 = new cfe(readStrongBinder11);
                    }
                }
                wbe.d(parcel);
                generateEventId(hfeVar8);
                break;
            case 23:
                String readString15 = parcel.readString();
                long readLong12 = parcel.readLong();
                wbe.d(parcel);
                beginAdUnitExposure(readString15, readLong12);
                break;
            case 24:
                String readString16 = parcel.readString();
                long readLong13 = parcel.readLong();
                wbe.d(parcel);
                endAdUnitExposure(readString16, readLong13);
                break;
            case 25:
                yj5 T3 = n78.T(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                wbe.d(parcel);
                onActivityStarted(T3, readLong14);
                break;
            case 26:
                yj5 T4 = n78.T(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                wbe.d(parcel);
                onActivityStopped(T4, readLong15);
                break;
            case 27:
                long readLong16 = parcel.readLong();
                wbe.d(parcel);
                onActivityCreated(n78.T(parcel.readStrongBinder()), (Bundle) wbe.a(parcel, Bundle.CREATOR), readLong16);
                break;
            case 28:
                yj5 T5 = n78.T(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                wbe.d(parcel);
                onActivityDestroyed(T5, readLong17);
                break;
            case 29:
                yj5 T6 = n78.T(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                wbe.d(parcel);
                onActivityPaused(T6, readLong18);
                break;
            case 30:
                yj5 T7 = n78.T(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                wbe.d(parcel);
                onActivityResumed(T7, readLong19);
                break;
            case 31:
                yj5 T8 = n78.T(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof hfe) {
                        hfeVar7 = (hfe) queryLocalInterface12;
                    } else {
                        hfeVar7 = new cfe(readStrongBinder12);
                    }
                }
                long readLong20 = parcel.readLong();
                wbe.d(parcel);
                onActivitySaveInstanceState(T8, hfeVar7, readLong20);
                break;
            case 32:
                Bundle bundle3 = (Bundle) wbe.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof hfe) {
                        hfeVar6 = (hfe) queryLocalInterface13;
                    } else {
                        hfeVar6 = new cfe(readStrongBinder13);
                    }
                }
                long readLong21 = parcel.readLong();
                wbe.d(parcel);
                performAction(bundle3, hfeVar6, readLong21);
                break;
            case Token.GETPROP /* 33 */:
                int readInt = parcel.readInt();
                String readString17 = parcel.readString();
                yj5 T9 = n78.T(parcel.readStrongBinder());
                yj5 T10 = n78.T(parcel.readStrongBinder());
                yj5 T11 = n78.T(parcel.readStrongBinder());
                wbe.d(parcel);
                logHealthData(readInt, readString17, T9, T10, T11);
                break;
            case Token.GETPROPNOWARN /* 34 */:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof age) {
                        ageVar3 = (age) queryLocalInterface14;
                    } else {
                        ageVar3 = new vfe(readStrongBinder14);
                    }
                }
                wbe.d(parcel);
                setEventInterceptor(ageVar3);
                break;
            case Token.GETPROP_SUPER /* 35 */:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof age) {
                        ageVar2 = (age) queryLocalInterface15;
                    } else {
                        ageVar2 = new vfe(readStrongBinder15);
                    }
                }
                wbe.d(parcel);
                registerOnMeasurementEventListener(ageVar2);
                break;
            case Token.GETPROPNOWARN_SUPER /* 36 */:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof age) {
                        ageVar = (age) queryLocalInterface16;
                    } else {
                        ageVar = new vfe(readStrongBinder16);
                    }
                }
                wbe.d(parcel);
                unregisterOnMeasurementEventListener(ageVar);
                break;
            case Token.SETPROP /* 37 */:
                HashMap readHashMap = parcel.readHashMap(wbe.a);
                wbe.d(parcel);
                initForTests(readHashMap);
                break;
            case Token.SETPROP_SUPER /* 38 */:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof hfe) {
                        hfeVar5 = (hfe) queryLocalInterface17;
                    } else {
                        hfeVar5 = new cfe(readStrongBinder17);
                    }
                }
                int readInt2 = parcel.readInt();
                wbe.d(parcel);
                getTestFlag(hfeVar5, readInt2);
                break;
            case Token.GETELEM /* 39 */:
                ClassLoader classLoader4 = wbe.a;
                if (parcel.readInt() != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                wbe.d(parcel);
                setDataCollectionEnabled(z6);
                break;
            case Token.GETELEM_SUPER /* 40 */:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof hfe) {
                        hfeVar4 = (hfe) queryLocalInterface18;
                    } else {
                        hfeVar4 = new cfe(readStrongBinder18);
                    }
                }
                wbe.d(parcel);
                isDataCollectionEnabled(hfeVar4);
                break;
            case Token.SETELEM /* 41 */:
            case Token.NULL /* 47 */:
            case Token.FALSE /* 49 */:
            default:
                return false;
            case Token.SETELEM_SUPER /* 42 */:
                wbe.d(parcel);
                setDefaultEventParameters((Bundle) wbe.a(parcel, Bundle.CREATOR));
                break;
            case Token.CALL /* 43 */:
                long readLong22 = parcel.readLong();
                wbe.d(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case Token.NAME /* 44 */:
                long readLong23 = parcel.readLong();
                wbe.d(parcel);
                setConsent((Bundle) wbe.a(parcel, Bundle.CREATOR), readLong23);
                break;
            case Token.NUMBER /* 45 */:
                long readLong24 = parcel.readLong();
                wbe.d(parcel);
                setConsentThirdParty((Bundle) wbe.a(parcel, Bundle.CREATOR), readLong24);
                break;
            case Token.STRING /* 46 */:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface19 instanceof hfe) {
                        hfeVar3 = (hfe) queryLocalInterface19;
                    } else {
                        hfeVar3 = new cfe(readStrongBinder19);
                    }
                }
                wbe.d(parcel);
                getSessionId(hfeVar3);
                break;
            case Token.THIS /* 48 */:
                wbe.d(parcel);
                setSgtmDebugInfo((Intent) wbe.a(parcel, Intent.CREATOR));
                break;
            case Token.TRUE /* 50 */:
                String readString18 = parcel.readString();
                String readString19 = parcel.readString();
                long readLong25 = parcel.readLong();
                wbe.d(parcel);
                setCurrentScreenByScionActivityInfo((ahe) wbe.a(parcel, ahe.CREATOR), readString18, readString19, readLong25);
                break;
            case Token.SHEQ /* 51 */:
                long readLong26 = parcel.readLong();
                wbe.d(parcel);
                onActivityStartedByScionActivityInfo((ahe) wbe.a(parcel, ahe.CREATOR), readLong26);
                break;
            case Token.SHNE /* 52 */:
                long readLong27 = parcel.readLong();
                wbe.d(parcel);
                onActivityStoppedByScionActivityInfo((ahe) wbe.a(parcel, ahe.CREATOR), readLong27);
                break;
            case Token.REGEXP /* 53 */:
                long readLong28 = parcel.readLong();
                wbe.d(parcel);
                onActivityCreatedByScionActivityInfo((ahe) wbe.a(parcel, ahe.CREATOR), (Bundle) wbe.a(parcel, Bundle.CREATOR), readLong28);
                break;
            case Token.BINDNAME /* 54 */:
                long readLong29 = parcel.readLong();
                wbe.d(parcel);
                onActivityDestroyedByScionActivityInfo((ahe) wbe.a(parcel, ahe.CREATOR), readLong29);
                break;
            case Token.THROW /* 55 */:
                long readLong30 = parcel.readLong();
                wbe.d(parcel);
                onActivityPausedByScionActivityInfo((ahe) wbe.a(parcel, ahe.CREATOR), readLong30);
                break;
            case Token.RETHROW /* 56 */:
                long readLong31 = parcel.readLong();
                wbe.d(parcel);
                onActivityResumedByScionActivityInfo((ahe) wbe.a(parcel, ahe.CREATOR), readLong31);
                break;
            case Token.IN /* 57 */:
                ahe aheVar = (ahe) wbe.a(parcel, ahe.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface20 instanceof hfe) {
                        hfeVar2 = (hfe) queryLocalInterface20;
                    } else {
                        hfeVar2 = new cfe(readStrongBinder20);
                    }
                }
                long readLong32 = parcel.readLong();
                wbe.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(aheVar, hfeVar2, readLong32);
                break;
            case Token.INSTANCEOF /* 58 */:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    if (queryLocalInterface21 instanceof sfe) {
                        sfeVar = (sfe) queryLocalInterface21;
                    } else {
                        sfeVar = new ftd(readStrongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 4);
                    }
                }
                wbe.d(parcel);
                retrieveAndUploadBatches(sfeVar);
                break;
            case Token.LOCAL_LOAD /* 59 */:
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                Bundle bundle4 = (Bundle) wbe.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z7 = false;
                    z9 = true;
                } else {
                    z7 = false;
                }
                if (parcel.readInt() != 0) {
                    z8 = true;
                } else {
                    z8 = z7;
                }
                long readLong33 = parcel.readLong();
                long readLong34 = parcel.readLong();
                wbe.d(parcel);
                logEventWithElapsedTime(readString20, readString21, bundle4, z9, z8, readLong33, readLong34);
                break;
            case Token.GETVAR /* 60 */:
                yj5 T12 = n78.T(parcel.readStrongBinder());
                xge xgeVar = (xge) wbe.a(parcel, xge.CREATOR);
                long readLong35 = parcel.readLong();
                long readLong36 = parcel.readLong();
                wbe.d(parcel);
                initializeWithElapsedTime(T12, xgeVar, readLong35, readLong36);
                break;
            case Token.SETVAR /* 61 */:
                long readLong37 = parcel.readLong();
                long readLong38 = parcel.readLong();
                wbe.d(parcel);
                resetAnalyticsDataWithElapsedTime(readLong37, readLong38);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
