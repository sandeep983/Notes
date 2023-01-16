from django.contrib import admin
from django.urls import path, include
from flightApp import views
from rest_framework.routers import DefaultRouter
from rest_framework.authtoken.views import obtain_auth_token

router = DefaultRouter()
router.register('flights', views.FlightViewSet)
router.register('passengers', views.PassengerViewSet)
router.register('reservations', views.ReservationViewSet)

urlpatterns = [
    path('admin/', admin.site.urls),
    path('flightApi/', include(router.urls)),
    path('flightApi/findFlights/', views.find_flights),
    path('flightApi/saveReservation/', views.save_reservation),
    path('api-token-auth/', obtain_auth_token, name="api_token_auth")
]
